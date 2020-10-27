# Elevator
## Introduction
A 1.6.4 Spigot plugin that allows you to ascend a certain amount of blocks.

It teleports you up the amount of blocks you specify and places a glass block under you in case you're in survival mode or just haven't enabled fly in creative.

## Usage
```
/up <height>
```
* `<height>` is the amount of blocks you want to ascend by.
 
## Dependencies
Elevator requires SeePlayerInventory for permissions. Mainly due to quick coding on my part - so I just stole the permissions from there. SeePlayerInventory is in the root directory of this repo. and it'll be included in all future releases for download.
 
### SeePlayerInventory related pages:
* [SpigotMC.org](https://www.spigotmc.org/resources/seeplayerinventory.11913/)
    * [Wayback Machine Snapshot](http://web.archive.org/web/20190128163728/https://www.spigotmc.org/resources/seeplayerinventory.11913/)
    * [Spigot Direct Download Link](https://www.spigotmc.org/resources/seeplayerinventory.11913/download?version=43331)
* [Direct GitHub Download (From this repo.)](https://raw.githubusercontent.com/Toydotgame/Elevator/master/SeePlayerInventory.jar)

## Planned Features
* Confirmation message when you ascend.
* Custom permissions. (As in SeePlayerInventory is no longer needed. The plugin will be able to use it's own permissions. All I've gotta do is find out how on Earth to do that...)

## Installing
* Download the latest release of Elevator from the [releases](https://github.com/Toydotgame/elevator/releases) tab along with SeePlayerInventory (Either from [Spigot](https://www.spigotmc.org/resources/seeplayerinventory.11913/download?version=43331) or the [latest release](https://github.com/Toydotgame/elevator/releases) page)
* Once downloaded, put the two `.jar`s into the `/plugins` directory of your Spigot 1.6.4 server.
* Run `reload` or `restart` in the console, or `stop` and manually re-launch the server by yourself. The plugin will be loaded automatically.
