module github.com/pulumi/pulumi-alicloud

go 1.13

replace github.com/Sirupsen/logrus => github.com/sirupsen/logrus v0.0.0-20181010200618-458213699411

require (
	github.com/hashicorp/terraform-plugin-sdk v1.4.1
	github.com/pkg/errors v0.8.1
	github.com/pulumi/pulumi v1.8.1
	github.com/pulumi/pulumi-terraform-bridge v1.5.2
	github.com/terraform-providers/terraform-provider-alicloud v1.68.0
)
