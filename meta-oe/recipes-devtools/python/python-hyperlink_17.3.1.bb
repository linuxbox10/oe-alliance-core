SUMMARY = "A featureful, correct URL for Python"
DESCRIPTION = "Hyperlink is a featureful, pure-Python implementation of the URL, with an emphasis on correctness."
HOMEPAGE = "https://github.com/python-hyper/hyperlink"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3893d4ed05dcc823f8ed685a9ea19bcb"

inherit pypi setuptools

SRC_URI[md5sum] = "eaccb9845b559817e838846669cbc68a"
SRC_URI[sha256sum] = "bc4ffdbde9bdad204d507bd8f554f16bba82dd356f6130cb16f41422909c33bc"

include python-package-split.inc
