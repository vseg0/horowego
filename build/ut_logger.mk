# Initialize make tools
include makefile.tools

# Target settings
LANG := c
#LANG := c++
#TARGET := ut_logger
#TARGETTYPE := executable

#TARGET := libut_logger.a
#TARGETTYPE := staticlib

#DEPENDENCIES := $(BINOUTDIR)/libXXX.a

SRCDIRS :=  ../src/ut_logger/src                        \
            ../src/ut_logger/src

HDRDIRS :=  ../src/ut_logger/inc	                    \
            ../src/ut_logger/inc

include ./config/$(TOOLCHAIN)/ut_logger.cfg

#make_dependencies:
#	@$(MAKE) --no-print-directory CCFLAG="$(CCFLAG)" LDFLAG="$(LDFLAG)" -f XXX.mk build

# Automated target make procedures: designed to fit any product
include makefile.rules