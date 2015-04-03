KV = "3.14.21"
SRCDATE = "20150403"

require et-dvb-modules.inc

SRC_URI = "http://xtrendet.net/${MACHINE}-drivers-${KV}-${SRCDATE}.zip"

SRC_URI[md5sum] = "9c7fbd28677e54e4d7b636dbc3907075"
SRC_URI[sha256sum] = "3a7535c9b7dc47d2442328804da47f7e8b9f46362f1a18c1044738335e37a76d"

COMPATIBLE_MACHINE = "et7x00"
