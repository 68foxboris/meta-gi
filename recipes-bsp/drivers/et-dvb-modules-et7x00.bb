KV = "3.14.21"
SRCDATE = "20150312"

require et-dvb-modules.inc

SRC_URI = "http://xtrendet.net/${MACHINE}-drivers-${KV}-${SRCDATE}.zip"

SRC_URI[md5sum] = "732cce466e351b643267560bca823826"   
SRC_URI[sha256sum] = "4139454a43e192fd745d57b8be90675735ce143d30c0b035c6d2a2b44c18dad9"

COMPATIBLE_MACHINE = "et7x00"
