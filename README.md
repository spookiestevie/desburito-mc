# desburito-mc 1.14.3 SERVER

## backup command (auto-runs weekly):
`bash /home/smtpserver/Minecraft/backup-server.sh`

## analytics page :
http://desburito.com:8804/server/Plan

## plugins:

| Plugin name              | Version       | 1.14 Compat | Link                                                   |
|--------------------------|---------------|-------------|--------------------------------------------------------|
| Clearlag                 | v3.0.6        | y.          | [Go to Bukkit](https://dev.bukkit.org/projects/clearlagg)|
| EpicRename               | v3.5          | n.          | [Go to Spigot](https://www.spigotmc.org/resources/epicrename.4341/)|
| EssentialsX              | 2.17.0        | y.          | [Go to Bukkit](https://dev.bukkit.org/projects/essentialsx)| 
| EssentialsGeoIP          | 2.17.0        | y.          | [Go to Bukkit](https://dev.bukkit.org/projects/essentialsx)|
| EssentialsXChat          | 2.17.0        | y.          | [Go to Bukkit](https://dev.bukkit.org/projects/essentialsx)|
| EssentialsXGeoIP         | 2.17.0        | y.          | [Go to Bukkit](https://dev.bukkit.org/projects/essentialsx)|
| EssentialsXProtect       | 2.17.0        | y.          | [Go to Bukkit](https://dev.bukkit.org/projects/essentialsx)|
| EssentialsXSpawn         | 2.17.0        | y.          | [Go to Bukkit](https://dev.bukkit.org/projects/essentialsx)|
| EssentialsXXMPP          | 2.17.0        | y.          | [Go to Bukkit](https://dev.bukkit.org/projects/essentialsx)|
| Savage Factions          | 2.2 BETA      | y.          | [Go to Spigot](https://www.spigotmc.org/resources/savagefactions-the-ultimate-factions-plugin-1-8-1-14-2-0-beta-released.52891/)|
| Multiverse-Core          | 4.0.0         | y.          | [Go to Bukkit](https://dev.bukkit.org/projects/multiverse-core)|
| Multiverse-NetherPortals | 4.0.0         | y.          | [Go to Bukkit](https://dev.bukkit.org/projects/multiverse-core)|
| Multiverse-Portals       | 4.0.0         | y.          | [Go to Bukkit](https://dev.bukkit.org/projects/multiverse-core)|
| Multiverse-SignPortals   | 4.0.0         | y.          | [Go to Bukkit](https://dev.bukkit.org/projects/multiverse-core)|
| PermissionsEx            | 1.23.4        | y.          | [Go to Bukkit](https://dev.bukkit.org/projects/permissionsex)|
| Plan                     | 4.8.6         | y.          | [Go to Spigot](https://www.spigotmc.org/resources/plan-player-analytics.32536/)|
| Vault                    | 1.7.2         | y.          | [Go to Bukkit](https://dev.bukkit.org/projects/vault)|
| mcMMO                    | 1.6.1         | y.          | [Go to Jenkins](https://popicraft.net/jenkins/job/mcMMO/)|
| perworldinventory        | kt-2.3.1      | y.          | [Go to Spigot](https://www.spigotmc.org/resources/per-world-inventory.4482/)|
| worldedit-bukkit         | 7.0.0         | y.          | [Go to Bukkit](https://dev.bukkit.org/projects/worldedit)|
| worldguard-legacy        | 7.0.0         | y.          | [Go to Bukkit](https://dev.bukkit.org/projects/worldguard)|
| Guishop                  | 7.1.5         | y.          | [Go to Bukkit](https://dev.bukkit.org/projects/gui-shop)|
| NPCAuctions              | v1.0.62       | y.          | [Go to Bukkit](https://dev.bukkit.org/projects/npcauctions)|
| RandomTP                 | 1.0.7.2 BETA  | y.          | [Go to Spigot](https://www.spigotmc.org/resources/randomtp-%E1%B4%8F%CA%80%C9%AA%C9%A2%C9%AA%C9%B4%E1%B4%80%CA%9F-sign-gui-menu-now-recoded-best-random-teleport-plugin.5084/history)|
| Matric AC                | v2.0.5        | y.          | [Go to Spigot](https://www.spigotmc.org/resources/matrix-anticheat-hack-killaura-blocker-machine-learning-1-8-1-12-1-13-1-14.64635/updates)|
| ProtocolLib              | v4.0.5 SNAP   | y.          | [Go to Jenkins](http://ci.dmulloy2.net/job/ProtocolLib/)|
## Other (development) :
The server is **live** in the **mcv/** directory and the **mcv-backup/** is where **backups** are made weekly and where this git repo is initialised

**(in mcv-backup)**
### commit backup to this repo : 
`sudo git add . && sudo git commit -m 'MESSAGE' && sudo git push origin master`

### connect to screen and start server : 
`screen -x 2300` --> `bash mcv/start.sh`

### kill java process : 
`sudo killall java`
