KV = "3.14.21"
SRCDATE = "20150209"

require et-dvb-modules.inc

SRC_URI = "http://xtrendet.net/${MACHINE}-drivers-${KV}-${SRCDATE}.zip"

SRC_URI[md5sum] = "d2a3561e41935778630fcce6dc9ec347"
SRC_URI[sha256sum] = "60a2fd99ca8901864934eb11633c49bdf1dde828469f53a8507b3443e7401930"

COMPATIBLE_MACHINE = "et7x00"
