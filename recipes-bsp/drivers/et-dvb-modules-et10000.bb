KV = "3.14.16"
SRCDATE = "20141029"

require et-dvb-modules.inc

SRC_URI = "http://www.xtrendet.net/${MACHINE}-drivers-${KV}-${SRCDATE}.zip"

SRC_URI[md5sum] = "43035e08837415483cd73ebb09b4e136"
SRC_URI[sha256sum] = "23f5d6b20d840212594fa564928803d3ea0625fec46b0a8fc5db2d21445fc820"

COMPATIBLE_MACHINE = "et10000"
