module github.com/pulumi/pulumi-alicloud/provider/v2

go 1.14

replace (
	github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
	github.com/Sirupsen/logrus => github.com/sirupsen/logrus v0.0.0-20181010200618-458213699411
	github.com/denverdino/aliyungo => github.com/denverdino/aliyungo v0.0.0-20201111050017-ecb1ab1b9105
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
	k8s.io/api => k8s.io/api v0.0.0-20190409021203-6e4e0e4f393b
	k8s.io/client-go => k8s.io/client-go v0.0.0-20191029021442-5f2132fc4383
)

require (
	github.com/aliyun/terraform-provider-alicloud v1.104.0
	github.com/hashicorp/terraform-plugin-sdk v1.7.0
	github.com/pulumi/pulumi-terraform-bridge/v2 v2.13.2
	github.com/pulumi/pulumi/sdk/v2 v2.13.3-0.20201109230029-a6f8b9b205cd
)
