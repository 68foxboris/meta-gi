KV = "3.14.21"
SRCDATE = "20150123"

require et-dvb-modules.inc

SRC_URI = "http://xtrendet.net/${MACHINE}-drivers-${KV}-${SRCDATE}.zip"

SRC_URI[md5sum] = "26aa1ec4e86126fa50878544458d99aa"
SRC_URI[sha256sum] = "710a0eaa4b4652997dd4530072ab74aed082cd6368cb3592395b0543c63285e6"

COMPATIBLE_MACHINE = "et7x00"
