KV = "3.14.21"
SRCDATE = "20150115"

require et-dvb-modules.inc

SRC_URI = "http://xtrendet.net/${MACHINE}-drivers-${KV}-${SRCDATE}.zip"

SRC_URI[md5sum] = "acd566647bf56f15588566c6a078d8fd"
SRC_URI[sha256sum] = "d897dab692f930b37cb73fca65e768e6f94763744363cf497448c55f86469f56"

COMPATIBLE_MACHINE = "et8500"
