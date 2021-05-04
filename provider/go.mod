module github.com/pulumi/pulumi-alicloud/provider/v3

go 1.16

replace (
	github.com/Sirupsen/logrus => github.com/sirupsen/logrus v0.0.0-20181010200618-458213699411
	github.com/denverdino/aliyungo => github.com/denverdino/aliyungo v0.0.0-20210318042315-546d0768f5c7
	github.com/hashicorp/go-getter v1.5.0 => github.com/hashicorp/go-getter v1.4.0
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
	k8s.io/api => k8s.io/api v0.0.0-20190409021203-6e4e0e4f393b
	k8s.io/client-go => k8s.io/client-go v0.0.0-20191029021442-5f2132fc4383
)

require (
	github.com/aliyun/terraform-provider-alicloud v1.122.0
	github.com/hashicorp/terraform-plugin-sdk v1.7.0
	github.com/pulumi/pulumi-terraform-bridge/v3 v3.0.0
	github.com/pulumi/pulumi/pkg/v3 v3.0.0
	github.com/pulumi/pulumi/sdk/v3 v3.0.0
)
