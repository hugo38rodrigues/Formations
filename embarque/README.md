# Cours condensé — Concepts et vocabulaire de l'embarqué bas niveau

> **Objectif** : pouvoir tenir une conversation technique en entretien Expleo. Tu n'as pas besoin de savoir *coder* tout ça, tu dois pouvoir *expliquer* chaque concept avec tes mots.
>
> **Méthode de révision** : pour chaque section, lis, puis ferme le document et explique le concept à voix haute. Si tu cales, relis. Refais ça 2-3 fois sur 10 jours.

---

## 1. Qu'est-ce qu'un système embarqué ?

Un **système embarqué** est un ordinateur dédié à une tâche spécifique, intégré dans un produit. Contrairement à un PC qui peut tout faire, un système embarqué fait *une* chose, souvent en boucle, souvent avec des contraintes fortes.

**Exemples concrets :**
- ABS d'une voiture
- Pacemaker
- Centrale d'alarme
- Calculateur de vol d'un avion
- Box internet
- Thermostat connecté
- Carte mère d'un drone

**Les contraintes typiques de l'embarqué :**
- **Ressources limitées** : peu de RAM (parfois quelques Ko), peu de flash, CPU modeste
- **Temps réel** : la réponse doit arriver dans un délai borné (un airbag doit se déclencher en moins de 50 ms, sinon c'est inutile)
- **Consommation** : tourner des mois sur une pile
- **Fiabilité** : ça ne doit pas planter, ou redémarrer tout seul
- **Coût** : produit à des millions d'exemplaires, chaque centime compte
- **Environnement** : températures extrêmes, vibrations, parasites électriques

**Phrase à retenir pour l'entretien :**
> "Un système embarqué, c'est un ordinateur spécialisé qui doit faire une tâche précise avec des contraintes fortes de ressources, de temps de réponse et de fiabilité."

---

## 2. Microcontrôleur (µC) vs Microprocesseur (µP) vs SoC

C'est **le** trio à connaître. Tu confonds, tu perds des points.

### Microcontrôleur (µC)

**Tout-en-un sur une puce** : CPU + RAM + Flash (mémoire programme) + périphériques (UART, I2C, ADC, timers, GPIO) intégrés.

- Petit, peu cher, faible consommation
- Idéal pour les petites tâches dédiées
- Exemples : **STM32** (STMicroelectronics), **ESP32**, **AVR** (utilisé dans Arduino), **PIC**

### Microprocesseur (µP)

**Juste le CPU.** La RAM, la flash, les périphériques sont *externes*, sur des puces séparées soudées sur la carte.

- Plus puissant qu'un µC
- Demande plus de composants autour
- Aujourd'hui surtout dans les PC et serveurs (mais aussi dans certains systèmes embarqués haut de gamme)

### SoC (System On Chip)

**Un gros µC très intégré**, qui embarque souvent un GPU, des contrôleurs USB, Ethernet, des accélérateurs vidéo, parfois un modem.

- Utilisé dans les smartphones, Raspberry Pi, set-top boxes
- Assez puissant pour faire tourner Linux
- Exemples : **i.MX** (NXP), **BCM2711** (Raspberry Pi 4), **Snapdragon** (Qualcomm, smartphones)

### Tableau récap

| | µC | µP | SoC |
|---|---|---|---|
| Tout intégré | Oui | Non | Oui (beaucoup) |
| Puissance | Faible | Élevée | Moyenne à élevée |
| Fait tourner Linux | Non* | Oui | Oui |
| Usage typique | Capteur, actionneur | PC, serveur | Smartphone, Pi |
| Exemple | STM32 | Intel Core i7 | Raspberry Pi BCM2711 |

*\*Sauf µC très haut de gamme avec MMU, cas particulier*

---

## 3. Les trois mondes : Bare-metal, RTOS, Linux embarqué

C'est **le** point central de la fiche de poste. Apprends-le par cœur.

### Bare-metal ("sur le métal nu")

Le code tourne **directement sur le processeur, sans système d'exploitation**. Tu écris toi-même la boucle principale, tu gères les interruptions à la main.

```c
int main(void) {
    init_hardware();
    while (1) {
        if (button_pressed()) {
            led_on();
        } else {
            led_off();
        }
    }
}
```

**Avantages :** ultra-rapide, ultra-prédictible, très peu de mémoire utilisée.
**Inconvénients :** dur de gérer plusieurs tâches en parallèle, tout est à faire à la main.
**Quand on l'utilise :** petits µC qui font peu de choses (capteur de température, télécommande).

### RTOS (Real-Time Operating System)

Un **mini-système d'exploitation** qui permet de faire tourner plusieurs tâches (threads) en garantissant qu'elles s'exécutent dans un **délai borné**.

**Concepts clés :**
- **Tâches** (tasks) : unités de code qui s'exécutent en parallèle (en réalité, le CPU passe de l'une à l'autre très vite)
- **Ordonnanceur** (scheduler) : décide quelle tâche tourne quand, en fonction des priorités
- **Sémaphores, mutex, queues** : pour synchroniser les tâches entre elles

**Le mot-clé : déterministe.** Sur un RTOS, on sait *exactement* combien de temps une tâche prendra, dans le pire des cas. Sur Linux normal, non.

**Exemples de RTOS :**
- **FreeRTOS** (le plus connu, open-source, racheté par Amazon)
- **Zephyr** (porté par la Linux Foundation, monte en puissance)
- **VxWorks** (commercial, utilisé dans l'aéronautique et le spatial — Mars Rover)
- **ThreadX** (Microsoft, embarqué dans Azure RTOS)

**Quand on l'utilise :** dès qu'il y a plusieurs tâches à coordonner avec des contraintes temps réel (commande de moteur, communication, traitement de signal en parallèle).

### Linux embarqué

Un **vrai Linux**, mais personnalisé pour tourner sur du hardware embarqué. Tu retrouves les outils que tu connais : shell, processus, systemd, sockets réseau, etc. Mais sur une carte avec parfois 64 Mo de RAM.

**Pourquoi pas du Linux normal ?**
- Trop gros (un Ubuntu standard fait plusieurs Go)
- On veut choisir précisément les paquets inclus (sécurité, taille, certification)
- On veut adapter le noyau au matériel précis

**Yocto Project** (mentionné dans la fiche) : c'est un **build system**. Tu lui décris ce que tu veux dans ton Linux (paquets, noyau, drivers, config), et Yocto te génère une distribution Linux sur mesure pour ta carte. Très utilisé en automotive et industriel.

**Alternative à Yocto :** Buildroot (plus simple, plus léger).

**Linux n'est PAS temps réel** par défaut. Il existe des extensions (PREEMPT_RT) pour s'en approcher, mais pour du *vrai* temps réel dur, on reste sur RTOS.

**Quand on l'utilise :** quand on a besoin de connectivité (WiFi, Ethernet, USB), d'écrans riches, d'applications complexes. Set-top box, IHM industrielle, robot connecté.

### Tableau récap

| | Bare-metal | RTOS | Linux embarqué |
|---|---|---|---|
| OS | Aucun | Mini-OS spécialisé | Vrai Linux |
| Temps réel | Oui (par construction) | Oui (déterministe) | Soft real-time (best effort) |
| Multitâche | À la main | Oui (natif) | Oui (natif) |
| RAM requise | Quelques Ko | Quelques dizaines de Ko | Plusieurs Mo |
| Complexité | Faible | Moyenne | Élevée |
| Hardware cible | Petit µC | µC moyen/gros | SoC |

**Phrase à retenir :**
> "Bare-metal c'est sans OS, RTOS c'est un mini-OS temps réel pour gérer plusieurs tâches avec des délais garantis, et Linux embarqué c'est un Linux complet pour des cibles plus puissantes qui ont besoin de connectivité ou d'applications riches."

---

## 4. Les protocoles de communication

Connais-les *au moins* de nom, sache à quoi ils servent. La fiche cite UART, I2C, SPI, CAN, USB.

### UART (Universal Asynchronous Receiver-Transmitter)

- **Liaison série asynchrone** entre deux composants
- **2 fils** : TX (transmit) et RX (receive), plus une masse commune
- **Point-à-point** (un seul appareil de chaque côté)
- **Asynchrone** : pas d'horloge partagée, les deux côtés doivent s'accorder sur une vitesse (le "baud rate", ex : 9600, 115200)
- Usage : debug (port série pour afficher des logs), GPS, modules Bluetooth/WiFi

### I2C (Inter-Integrated Circuit, prononcer "I-deux-C" ou "I-two-C")

- **2 fils** : SDA (data) et SCL (clock)
- **Bus partagé** : on peut connecter plusieurs périphériques sur les mêmes 2 fils
- Chaque périphérique a une **adresse** (7 ou 10 bits)
- Maître-esclave (le µC est généralement le maître)
- Plutôt lent (100 kHz à 1 MHz typiquement)
- Usage : capteurs (température, accéléromètre), écrans OLED, EEPROM

### SPI (Serial Peripheral Interface)

- **4 fils** : MOSI, MISO, SCK (clock), CS/SS (chip select)
- **Full-duplex** (envoi et réception en même temps)
- Plus rapide qu'I2C (plusieurs MHz à plusieurs dizaines de MHz)
- Un fil CS par esclave (donc plus on a d'esclaves, plus on a de fils)
- Usage : cartes SD, écrans LCD, capteurs rapides, mémoires flash

### CAN (Controller Area Network)

- **2 fils** en paire torsadée (CAN_H et CAN_L), signal différentiel
- **Multi-maîtres** : plusieurs ECU peuvent émettre
- Très **robuste** aux parasites (utilisé en milieu industriel et automobile)
- Mécanisme de **priorité** sur les messages
- **Le bus de l'automobile** depuis 30 ans (toutes les voitures modernes)
- Aussi présent en aéronautique, ferroviaire, machines industrielles
- Vitesse typique : 500 kbit/s à 1 Mbit/s (CAN classique), 5 Mbit/s (CAN-FD)

### USB (Universal Serial Bus)

Tu connais. Notes pour l'embarqué :
- Beaucoup plus complexe à implémenter que les autres (protocole en couches)
- Souvent géré par un contrôleur dédié sur le µC
- USB device (la cible est un périphérique pour un PC) vs USB host (la cible accueille des périphériques)

### Tableau récap

| Protocole | Fils | Vitesse | Distance | Usage typique |
|---|---|---|---|---|
| UART | 2 (TX/RX) | Faible | Courte | Debug, modules sans fil |
| I2C | 2 (SDA/SCL) | Faible/moyenne | Courte (PCB) | Capteurs, EEPROM |
| SPI | 4+ | Élevée | Très courte | SD, écrans, mémoire |
| CAN | 2 différentiels | Moyenne | Longue (jusqu'à 40m) | Automobile, industrie |
| USB | 4 (D+/D-/VCC/GND) | Très élevée | Moyenne | Tout PC, périphériques |

---

## 5. Le concept de "driver" et de BSP

### Driver (pilote)

Code qui fait l'interface entre le matériel et le reste du logiciel. Quand le programme principal veut "envoyer un octet sur le port série", il appelle une fonction du driver UART, qui va manipuler les bons registres matériels pour faire le travail.

**En pratique** : un driver UART contient des fonctions comme `uart_init()`, `uart_send_byte()`, `uart_receive_byte()`, et c'est lui qui sait comment configurer le périphérique UART du µC (sa fréquence d'horloge, son baud rate, ses interruptions).

### BSP (Board Support Package)

L'**ensemble du code bas niveau spécifique à une carte donnée**. Quand tu portes un OS (Linux, un RTOS) sur une nouvelle carte, tu écris ou adaptes le BSP.

Il contient typiquement :
- Le code de démarrage (boot loader, init des horloges, init de la RAM)
- Les drivers des périphériques de la carte
- La configuration mémoire (où est la flash, où est la RAM)
- Les fichiers de description du matériel (Device Tree sous Linux)

**Phrase à retenir :**
> "Un driver, c'est le code qui pilote un périphérique matériel précis. Un BSP, c'est l'ensemble du code bas niveau qui permet de faire fonctionner une carte complète, drivers compris."

---

## 6. Temps réel : dur vs mou

- **Temps réel dur (hard real-time)** : si la deadline est ratée, c'est un échec critique (airbag, freinage ABS, contrôle de vol). Utilisation de RTOS.
- **Temps réel mou (soft real-time)** : si la deadline est ratée, c'est désagréable mais pas catastrophique (lecture vidéo, jeu vidéo). Linux suffit souvent.

---

## 7. Débogage embarqué : on-chip debugging

Quand tu débogues du code embarqué, tu ne peux pas juste lancer un `printf` n'importe où — parfois il n'y a pas d'écran, pas de console. Tu utilises :

### Sondes de debug

Un boîtier qui se connecte d'un côté à ton PC (USB), de l'autre à la cible via des broches spécifiques sur le µC. Les protocoles principaux :

- **JTAG** : standard historique, 4-5 fils
- **SWD (Serial Wire Debug)** : version simplifiée de JTAG, 2 fils, utilisée sur ARM Cortex-M (donc STM32 etc.)

Marques de sondes connues : **ST-Link** (STM32), **J-Link** (Segger, qualité haut de gamme), **DAPLink** (open).

### Outils

- **GDB** (GNU Debugger) : le débogueur de la chaîne GNU, marche aussi en embarqué (gdb-multiarch, arm-none-eabi-gdb)
- **OpenOCD** : "serveur" qui parle aux sondes de debug et expose une interface GDB
- **IDE intégrés** : STM32CubeIDE, IAR Embedded Workbench, Keil µVision, qui packagent tout

### Ce qu'on peut faire en on-chip debugging

- Mettre des points d'arrêt (breakpoints) qui arrêtent l'exécution sur la cible
- Lire/écrire la mémoire en direct
- Voir les valeurs des registres CPU
- Exécuter pas à pas (step)
- Trace (enregistrer ce qui s'est passé, sans interrompre)

---

## 8. Les outils de l'écosystème embarqué (à connaître de nom)

- **Cross-compilation** : on développe sur un PC (x86) mais on compile pour une autre architecture (ARM, RISC-V...). Les compilateurs croisés s'appellent par exemple `arm-none-eabi-gcc`.
- **Makefile / CMake** : outils de build, omniprésents en C/C++.
- **Git** : tu connais.
- **Jenkins / GitLab CI** : intégration continue, utilisée aussi en embarqué.
- **Wireshark** : analyse de trames réseau (utile pour Ethernet, USB, CAN avec extensions).
- **Logic analyzer** (analyseur logique) : appareil hardware qui enregistre et décode les signaux des bus (UART, I2C, SPI, CAN). Marques : Saleae, PicoScope.
- **Oscilloscope** : pour voir les signaux analogiques.

---

## 9. ARM et architectures

La fiche ne le précise pas mais c'est utile :

- **ARM** est l'architecture dominante en embarqué. ARM ne fabrique pas les puces, ils vendent des licences à STMicroelectronics, NXP, Texas Instruments, etc.
- **Cortex-M** : les cœurs ARM pour µC (M0, M3, M4, M7...) — c'est ce que tu trouveras sur un STM32.
- **Cortex-A** : les cœurs ARM pour applications (smartphones, Raspberry Pi).
- **RISC-V** : architecture libre montante, on en parle de plus en plus.
- **x86** : encore présent dans certains systèmes industriels mais minoritaire en embarqué pur.

---

## 10. Vocabulaire express (flashcards)

Apprends à expliquer chacun en une phrase :

| Terme | Définition courte |
|---|---|
| **GPIO** | Broche d'entrée/sortie générique (General Purpose Input/Output) qu'on peut configurer en entrée ou en sortie |
| **Registre** | Petite zone mémoire dans le µC qui contrôle un périphérique ou contient un résultat de calcul |
| **Interruption (IRQ)** | Mécanisme par lequel le matériel "interrompt" le CPU pour signaler un événement (octet reçu, timer écoulé...) |
| **ISR (Interrupt Service Routine)** | La fonction qui s'exécute quand une interruption arrive |
| **DMA** | Direct Memory Access : permet de transférer de la donnée entre périphérique et mémoire sans solliciter le CPU |
| **Watchdog** | Compteur matériel qui reset le µC si le logiciel ne le "rafraîchit" pas régulièrement (anti-blocage) |
| **Firmware** | Le logiciel embarqué qui tourne sur un µC, souvent stocké en flash |
| **Bootloader** | Petit programme qui démarre en premier et charge le firmware principal (peut permettre la mise à jour over-the-air) |
| **Flashing** | Écrire le firmware dans la mémoire flash du µC |
| **MISRA C** | Ensemble de règles de codage strictes pour le C utilisées dans l'automobile et l'aéronautique (sécurité) |
| **Endianness** | Ordre des octets en mémoire (big-endian vs little-endian) |
| **Heap / Stack** | Heap = mémoire allouée dynamiquement (malloc). Stack = mémoire pour les variables locales et les appels de fonction |
| **Toolchain** | Ensemble des outils pour compiler : compilateur, linker, assembleur, debugger |

---

## 11. Les secteurs d'application (utile pour Expleo)

Expleo travaille beaucoup avec :
- **Aéronautique** (Airbus surtout) — DO-178C, ARINC
- **Automobile** — AUTOSAR, MISRA, ISO 26262
- **Ferroviaire** — EN 50128
- **Défense** — d'où l'habilitation mentionnée dans la fiche
- **Énergie / industrie**

Ces secteurs partagent une caractéristique : **fort niveau d'exigence de sûreté de fonctionnement** (safety-critical). Ça veut dire :
- Code certifié
- Documentation lourde
- Tests poussés
- Traçabilité de chaque ligne de code à une exigence

Tu n'as pas besoin de tout connaître, mais en mentionner un ou deux en entretien ("je sais que dans l'aéronautique on suit la DO-178C") fait bonne impression.

---

## 12. Auto-évaluation : peux-tu répondre à ces questions ?

Si tu réponds clairement aux 10 questions ci-dessous, tu es prêt côté concepts.

1. C'est quoi la différence entre un µC et un SoC ?
2. Bare-metal vs RTOS vs Linux embarqué — explique en 2 minutes.
3. Pourquoi a-t-on besoin d'un RTOS plutôt que Linux dans certains cas ?
4. Cite trois protocoles de communication et leurs cas d'usage.
5. Différence entre UART et I2C ?
6. C'est quoi Yocto et à quoi ça sert ?
7. C'est quoi un BSP ?
8. Comment débogue-t-on du code qui tourne sur un µC ?
9. Pourquoi le mot-clé `volatile` est-il important en embarqué ? (réponse dans le doc d'exercices C)
10. C'est quoi une interruption et une ISR ?

---

## 13. Ressources pour approfondir (gratuites)

- **YouTube — Quentin Quadrat / Embedded Systems** : chaînes francophones de qualité
- **YouTube — Low Level Learning** : très bon pour C et embarqué (anglais)
- **YouTube — Embedded.fm** : podcast, plutôt culture générale
- **Embedded Artistry blog** : articles de fond
- **Doc STM32CubeIDE** : si tu veux toucher un peu de pratique

Si tu veux toucher du concret en 2h :
1. Télécharge **STM32CubeIDE** (gratuit)
2. Cherche "STM32 blink LED tutorial" sur YouTube
3. Lance le simulateur, vois du vrai code embarqué tourner

Tu n'as pas besoin d'aller plus loin — l'idée c'est juste de mettre des images concrètes sur le vocabulaire.

---

**Bon courage. Tu n'as pas besoin de tout maîtriser. Tu dois juste prouver que tu comprends de quoi il s'agit, que tu es motivé, et que tu sauras tirer profit de la formation.**
