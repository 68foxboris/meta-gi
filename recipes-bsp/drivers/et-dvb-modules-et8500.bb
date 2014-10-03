KV = "3.14.10"
SRCDATE = "20140926"

require et-dvb-modules.inc

SRC_URI = "http://xtrendet.net/${MACHINE}-drivers-${KV}-${SRCDATE}.zip"

SRC_URI[md5sum] = "638520c9713bc97dd3124dd2038154b8"
SRC_URI[sha256sum] = "c83c8d5e03e03efa0e711118eb8348cc08a54609604e3398322d739c0b5b6df3"

COMPATIBLE_MACHINE = "et8500"
