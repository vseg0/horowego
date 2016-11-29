# Initialize make tools
include makefile.tools

#SRCDIR = ut_src

TARGET := UT

all: build

build:
	@echo $(BRIGHT)$(WHITE)"[BUILD]        "$(RESET) $(TARGET)
	@$(MAKE) --no-print-directory CCFLAG="$(CCFLAG)" LDFLAG="$(LDFLAG)" -f ut_logger.mk build
#	@$(MAKE) --no-print-directory CCFLAG="$(CCFLAG)" LDFLAG="$(LDFLAG)" -f ut_module_1.mk build
	@echo $(BRIGHT)$(GREEN)"[BUILD IS DONE]"$(RESET) $(BRIGHT)$(WHITE)$(TARGET)$(RESET)

clean:
	@echo $(BRIGHT)$(WHITE)"[CLEAN]        "$(RESET) $(TARGET)
	@$(MAKE) --no-print-directory CCFLAG="$(CCFLAG)" LDFLAG="$(LDFLAG)" -f ut_logger.mk clean
#	@$(MAKE) --no-print-directory CCFLAG="$(CCFLAG)" LDFLAG="$(LDFLAG)" -f ut_module_1.mk clean
	@echo $(BRIGHT)$(GREEN)"[CLEAN IS DONE]"$(RESET) $(BRIGHT)$(WHITE)$(TARGET)$(RESET)

rebuild: clean build

#run:
#	@$(MAKE) --no-print-directory CCFLAG="$(CCFLAG)" LDFLAG="$(LDFLAG)" -f ut_logger.mk run
#	@$(MAKE) --no-print-directory CCFLAG="$(CCFLAG)" LDFLAG="$(LDFLAG)" -f ut_module_1.mk run

debug:
	@$(MAKE) --no-print-directory CCFLAG="$(CCFLAG)" LDFLAG="$(LDFLAG)" -f ut_logger.mk debug
#	@$(MAKE) --no-print-directory CCFLAG="$(CCFLAG)" LDFLAG="$(LDFLAG)" -f ut_module_1.mk debug
