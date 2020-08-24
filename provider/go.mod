module github.com/pulumi/pulumi-alicloud/provider/v2

go 1.14

replace (
	github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
	github.com/Sirupsen/logrus => github.com/sirupsen/logrus v0.0.0-20181010200618-458213699411
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
	k8s.io/api => k8s.io/api v0.0.0-20191121015604-11707872ac1c
	k8s.io/client-go => k8s.io/client-go v0.0.0-20191029021442-5f2132fc4383
	github.com/denverdino/aliyungo => github.com/denverdino/aliyungo v0.0.0-20200720072455-26fa39a46424
)

require (
	github.com/hashicorp/terraform-plugin-sdk v1.7.0
	github.com/pulumi/pulumi-terraform-bridge/v2 v2.7.2
	github.com/pulumi/pulumi/sdk/v2 v2.9.1-0.20200821035132-629254334213
	github.com/aliyun/terraform-provider-alicloud v1.93.0
)
