# Install Pulumi and plugins required at build time.
install_plugins: .make/install_plugins
.make/install_plugins: export PULUMI_HOME := $(WORKING_DIR)/.pulumi
.make/install_plugins:
	pulumi plugin install converter terraform 1.2.4
	pulumi plugin install resource std 2.2.0
	pulumi plugin install resource random 4.3.1
	@touch $@
.PHONY: install_plugins
