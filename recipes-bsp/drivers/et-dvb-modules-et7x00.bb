KV = "3.14.21"
SRCDATE = "20150323"

require et-dvb-modules.inc

SRC_URI = "http://xtrendet.net/${MACHINE}-drivers-${KV}-${SRCDATE}.zip"

SRC_URI[md5sum] = "1799af530229a35fa158e66c4377ae27"
SRC_URI[sha256sum] = "2c3aef56e935904082db31b0d28f0e91301c6c1113ef734fe918801516669032"

COMPATIBLE_MACHINE = "et7x00"
