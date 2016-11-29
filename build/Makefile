# Initialize make tools
include makefile.tools

SRCDIR = src

TARGET := UT PROJECT

all: build

build:
	@echo $(BRIGHT)$(WHITE)"[BUILD]        "$(RESET) $(TARGET)
	@$(MAKE) --no-print-directory CCFLAG="$(CCFLAG)" LDFLAG="$(LDFLAG)" -f main.mk build
#	@$(MAKE) --no-print-directory CCFLAG="$(CCFLAG)" LDFLAG="$(LDFLAG)" -f ut_logger.mk build
	@echo $(BRIGHT)$(GREEN)"[BUILD IS DONE]"$(RESET) $(BRIGHT)$(WHITE)$(TARGET)$(RESET)

clean:
	@echo $(BRIGHT)$(WHITE)"[CLEAN]        "$(RESET) $(TARGET)
	@$(MAKE) --no-print-directory CCFLAG="$(CCFLAG)" LDFLAG="$(LDFLAG)" -f main.mk clean
#	@$(MAKE) --no-print-directory CCFLAG="$(CCFLAG)" LDFLAG="$(LDFLAG)" -f ut_logger.mk clean
	@echo $(BRIGHT)$(GREEN)"[CLEAN IS DONE]"$(RESET) $(BRIGHT)$(WHITE)$(TARGET)$(RESET)

rebuild: clean build


debug:
	@$(MAKE) --no-print-directory CCFLAG="$(CCFLAG)" LDFLAG="$(LDFLAG)" -f main.mk debug
#	@$(MAKE) --no-print-directory CCFLAG="$(CCFLAG)" LDFLAG="$(LDFLAG)" -f ut_logger.mk debug


help:
	@echo "[USAGE] Build UT in debug configuration: \"make build\" or \"make CFG=debug build\""
	@echo "[USAGE] Clean UT in debug configuration: \"make clean\" or \"make CFG=debug clean\""
	@echo "[USAGE] Rebuild UT in debug configuration: \"make rebuild\" or \"make CFG=debug rebuild\""
	@echo "[USAGE] Build UT in release configuration: \"make CFG=release build\""
	@echo "[USAGE] Clean UT in release configuration: \"make CFG=release clean\""
	@echo "[USAGE] Rebuild UT in release configuration: \"make CFG=release rebuild\""
#	@echo "[USAGE] Build UT in linux configuration: \"make TC=linux build\""
#	@echo "[USAGE] Clean UT in linux configuration: \"make TC=linux clean\""
#	@echo "[USAGE] Rebuild UT in linux configuration: \"make TC=linux rebuild\""
	@echo "[USAGE] Build UT with minimum verbose level: \"make VERB=0 build\""
	@echo "[USAGE] Clean UT with minimum verbose level: \"make VERB=0 clean\""
	@echo "[USAGE] Rebuild UT with minimum verbose level: \"make VERB=0 rebuild\""
	@echo "[USAGE] Build UT with maximum verbose level: \"make VERB=1 build\""
	@echo "[USAGE] Clean UT with maximum verbose level: \"make VERB=1 clean\""
	@echo "[USAGE] Rebuild UT with maximum verbose level: \"make VERB=1 rebuild\""