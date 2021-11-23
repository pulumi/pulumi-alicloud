module github.com/pulumi/pulumi-alicloud/provider/v3

go 1.16

replace (
	github.com/Sirupsen/logrus => github.com/sirupsen/logrus v0.0.0-20181010200618-458213699411
	github.com/denverdino/aliyungo => github.com/denverdino/aliyungo v0.0.0-20210910083501-4f11020c0bfb
	github.com/hashicorp/go-getter => github.com/hashicorp/go-getter v1.4.0
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
	k8s.io/api => k8s.io/api v0.21.0-rc.0
	k8s.io/client-go => k8s.io/client-go v0.21.0-rc.0
)

require (
	github.com/aliyun/terraform-provider-alicloud v1.144.0
	github.com/hashicorp/terraform-plugin-sdk v1.7.0
	github.com/pulumi/pulumi-terraform-bridge/v3 v3.11.0
	github.com/pulumi/pulumi/sdk/v3 v3.17.0
)
