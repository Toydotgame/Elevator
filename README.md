# tooExpensiveRemover
## Introduction
A 1.6.4 Spigot plugin that removes the "Too Expensive!" hardcap. This'll work. Hopefully. It's still in development.
 
Currently I'm working on a sub-command in this plugin which resets the enchantment cost of the held item to 1 level. Just for starting.
 
## Dependencies
tooExpensiveRemover requires SeePlayerInventory for permissions. Mainly due to quick coding on my part, plus SeePlayerInventory is [very roughly] related to tooExpensiveRemover - so I just stole the permissions from there. SeePlayerInventory is in the root directory of this repo. and it'll be included in all future releases for download.
 
### SeePlayerInventory related pages:
* [SpigotMC.org](https://www.spigotmc.org/resources/seeplayerinventory.11913/)
    * [Wayback Machine Snapshot](http://web.archive.org/web/20190128163728/https://www.spigotmc.org/resources/seeplayerinventory.11913/)

## Installing
* Download the latest release of tooExpensiveRemover from the [releases](https://github.com/Toydotgame/tooExpensiveRemover/releases) tab along with SeePlayerInventory (Either from [Spigot](https://www.spigotmc.org/resources/seeplayerinventory.11913/download?version=43331) or the [latest release](https://github.com/Toydotgame/tooExpensiveRemover/releases) page)
* Once downloaded, put the two `.jar`s into the `/plugins` directory of your Spigot 1.6.4 server.
* Run `reload` or `restart` in the console, or `stop` and manually re-launch the server by yourself. The plugin will be loaded automatically.
