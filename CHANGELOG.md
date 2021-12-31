CHANGELOG
=========

## HEAD (Unreleased)
* Upgrade terraform-provider-alicloud to v1.149.0

---

## 3.12.0 (2021-12-22)
* Upgrade to v1.148.0 of the AliCloud Terraform Provider

## 3.11.0 (2021-12-10)
* Upgrade to v1.146.0 of the AliCloud Terraform Provider
  **PLEASE NOTE:* `alicloud.cfg.getRules` will no longer accept the `memberId` or `multiAccount` parameters.

## 3.10.0 (2021-11-24)
* Upgrade to v1.144.0 of the AliCloud Terraform Provider

## 3.9.0 (2021-11-22)
* Upgrade to terraform-bridge 3.11.0
* Upgrade to pulumi 3.17.0
* Upgrade to v1.141.0 of the AliCloud Terraform Provider
  **PLEASE NOTE:* `alicloud.hbr.getVaults` will no longer accept the `createTime` parameter.

## 3.8.0 (2021-10-04)
* Upgrade to v1.137.0 of the AliCloud Terraform Provider

## 3.7.0 (2021-09-01)
* Upgrade to v1.133.0 of the AliCloud Terraform Provider

## 3.6.0 (2021-08-17)
* Upgrade to v1.131.0 of the AliCloud Terraform Provider

## 3.5.0 (2021-08-03)
* Upgrade to v1.129.0 of the AliCloud Terraform Provider
  **PLEASE NOTE:* There are a number of breaking changes in this provider update:
  * `alicloud.cas.Certificate` has been replaced by `alicloud.cas.ServiceCertificate` reflecting in missing properties in the old resource
  * `alicloud.cas.getCertificates` has been replaced by `alicloud.cas.getServiceCertificates` reflecting in missing properties in the old function

## 3.4.0 (2021-07-15)
* Upgrade to v1.126.0 of the AliCloud Terraform Provider  
  **PLEASE NOTE:* There are a number of breaking changes in this provider update:
  * `alicloud.ecs.Eip` has been replaced by `alicloud.ecs.EipAddress` reflecting in missing properties in the old resource
  * `alicloud.ecs.getEipAddresses` has been replaced by `alicloud.ecs.getEipAddresses` reflecting in missing properties in the old function

## 3.3.0 (2021-07-12)
* Upgrade to v1.125.0 of the AliCloud Terraform Provider  
  **PLEASE NOTE:* There are a number of breaking changes in this provider update:
  * `alicloud.cfg.Rule` has had `memberId` `multiAccount` and `scopeComplianceResourceId` input and output properties removed
  * `alicloud.cfg.getRules` has had `scopeComplianceResourceId` and `createTimestamp` removed from the Rule property and `messageType` input and output property removed.
  * `alicloud.slb.LoadBalancer` has been replaced by `alicloud.slb.ApplicationLoadBalancer` reflecting in missing properties in the old resource
  * `alicloud.slb.getLoadBalancers` has been replaced by `alicloud.slb.getApplicationLoadBalancers` reflecting in missing properties
  * `alicloud.slb.getCaCertificates` has had `createdTime` and `regionId` removed from the Certificate property.

## 3.2.0 (2021-05-21)
* Upgrade to v1.123.0 of the AliCloud Terraform Provider

## 3.1.0 (2021-05-12)
* Upgrade to v1.122.1 of the AliCloud Terraform Provider

## 3.0.1 (2021-04-30)
* Upgrade to v1.121.3 of the AliCloud Terraform Provider

## 3.0.0 (2021-04-19)
* Upgrade to v1.121.2 of the AliCloud Terraform Provider
* Depend on Pulumi 3.0, which includes improvements to Python resource arguments and key translation, Go SDK performance,
  Node SDK performance, general availability of Automation API, and more.

## 2.39.1 (2021-04-14)
* Upgrade to v1.121.1 of the AliCloud Terraform Provider

## 2.39.0 (2021-04-12)
* Upgrade to v1.120.0 of the AliCloud Terraform Provider
* Upgrade to pulumi-terraform-bridge v2.23.0

## 2.38.1 (2021-04-05)
* Upgrade to v1.119.1 of the AliCloud Terraform Provider

## 2.38.0 (2021-03-23)
* Upgrade to v1.119.0 of the AliCloud Terraform Provider
* Upgrade to pulumi-terraform-bridge v2.22.1  
  **Please Note:** This includes a bug fix to the refresh operation regarding arrays

## 2.37.0 (2021-03-16)
* Upgrade to pulumi-terraform-bridge v2.21.0
* Release macOS arm64 binary

## 2.36.0 (2021-03-10)
* Upgrade to v1.117.0 of the AliCloud Terraform Provider

## 2.35.1 (2021-02-16)
* Upgrade to pulumi-terraform-bridge v2.19.0  
  **Please Note:** This includes a bug fix that stops mutating resources options in the nodejs provider
* Avoid storing config from the environment into the state

## 2.35.0 (2021-02-08)
* Upgrade to v1.115.1 of the AliCloud Terraform Provider

## 2.34.0 (2021-02-03)
* Upgrade to v1.114.1 of the AliCloud Terraform Provider

## 2.33.0 (2021-02-01)
* Upgrade to pulumi-terraform-bridge v2.18.1

## 2.32.0 (2021-01-19)
* Upgrade to v1.113.0 of the AliCloud Terraform Provider

## 2.31.1 (2021-01-13)
* Upgrade to pulumi-terraform-bridge v2.17.0
* Upgrade to Pulumi v2.17.0

## 2.31.0 (2021-01-12)
* Upgrade to v1.112.0 of the AliCloud Terraform Provider

## 2.30.0 (2021-01-04)
* Upgrade to v1.111.0 of the AliCloud Terraform Provider

## 2.29.0 (2020-12-30)
* Upgrade to v1.110.0 of the AliCloud Terraform Provider

## 2.28.0 (2020-12-21)
* Upgrade to v1.109.1.0 of the AliCloud Terraform Provider

## 2.27.0 (2020-12-10)
* Upgrade to v1.105.0 of the AliCloud Terraform Provider

## 2.26.0 (2020-11-26)
* Upgrade to v1.104.0 of the AliCloud Terraform Provider

## 2.25.1 (2020-11-24)
* Upgrade to v1.103.2 of the AliCloud Terraform Provider
* Upgrade to pulumi-terraform-bridge v2.13.2  
  * This adds support for import specific examples in documentation

## 2.25.0 (2020-11-03)
* Upgrade to v1.103.0 of the AliCloud Terraform Provider

## 2.24.0 (2020-10-28)
* Upgrade to v1.102.0 of the AliCloud Terraform Provider

## 2.23.0 (2020-10-26)
* Improving the accuracy of previews leading to a more accurate understanding of what will actually change rather than assuming all output properties will change.  
  ** PLEASE NOTE:**  
  This new preview functionality can be disabled by setting `PULUMI_DISABLE_PROVIDER_PREVIEW` to `1` or `false`.

## 2.22.0 (2020-10-19)
* Upgrade to v1.101.0 of the AliCloud Terraform Provider
* Upgrade to Pulumi v2.12.0 and pulumi-terraform-bridge v2.11.0

## 2.21.1 (2020-10-14)
* Upgrade to v1.100.1 of the AliCloud Terraform Provider

## 2.21.0 (2020-10-12)
* Upgrade to v1.100.0 of the AliCloud Terraform Provider

## 2.20.0 (2020-09-30)
* Upgrade to v1.99.0 of the AliCloud Terraform Provider

## 2.19.0 (2020-09-24)
* Upgrade to v1.98.0 of the AliCloud Terraform Provider

## 2.18.0 (2020-09-21)
* Upgrade to v1.97.0 of the AliCloud Terraform Provider

## 2.17.0 (2020-09-14)
* Upgrade to v1.96.0 of the AliCloud Terraform Provider
* Upgrade to pulumi-terraform-bridge v2.8.0
* Upgrade to Pulumi v2.10.0

## 2.16.0 (2020-09-04)
* Upgrade to v1.95.0 of the AliCloud Terraform Provider

## 2.15.0 (2020-09-01)
* Upgrade to v1.94.0 of the AliCloud Terraform Provider

## 2.14.0 (2020-08-31)
* Upgrade to v1.93.0 of the AliCloud Terraform Provider
* Upgrade to pulumi-terraform-bridge v2.7.3
* Upgrade to Pulumi v2.9.0, which adds type annotations and input/output classes to Python

## 2.13.0 (2020-08-02)
* Upgrade to v1.92.0 of the AliCloud Terraform Provider

## 2.12.1 (2020-07-15)
* Upgrade to v1.90.1 of the AliCloud Terraform Provider

## 2.12.0 (2020-07-10)
* Upgrade to v1.90.0 of the AliCloud Terraform Provider

## 2.11.0 (2020-07-06)
* Upgrade to v1.89.0 of the AliCloud Terraform Provider

## 2.10.0 (2020-06-23)
* Upgrade to v1.88.0 of the AliCloud Terraform Provider

## 2.9.0 (2020-06-16)
* Upgrade to v1.87.0 of the AliCloud Terraform Provider

## 2.8.1 (2020-06-11)
* Switch to GitHub actions for build

## 2.8.0 (2020-06-06)
* Upgrade to v1.86.0 of the AliCloud Terraform Provider

## 2.7.0 (2020-06-01)
* Upgrade to v1.85.0 of the AliCloud Terraform Provider

## 2.6.0 (2020-05-28)
* Upgrade to Pulumi v2.3.0
* Upgrade to pulumi-terraform-bridge v2.4.0
* Upgrade to v1.84.0 of the AliCloud Terraform Provider

## 2.5.0 (2020-05-18)
* Upgrade to v1.83.0 of the AliCloud Terraform Provider

## 2.4.0 (2020-05-12)
* Upgrade to v1.82.0 of the AliCloud terraform provider
* Upgrade to pulumi-terraform-bridge v2.3.1

## 2.3.0 (2020-05-01)
* Upgrade to v1.81.0 of the AliCloud terraform provider
* Upgrade to pulumi-terraform-bridge v2.1.1
* Rename `dns.DdosBgpInstance` to `ddos.DdosBgpInstance`
* Rename `dns.DdosCooInstance` to `ddos.DdosCooInstance`

## 2.2.0 (2020-04-28)
* Regenerate datasource examples to be async
* Upgrade to pulumi-terraform-bridge v2.1.0

## v2.1.1 (2020-04-24)
* Upgrade to v1.80.1 of the AliCloud terraform provider

## 2.1.0 (2020-04-20)
* Upgrade to v1.80.0 of the AliCloud Terraform Provider

## 2.0.0 (2020-04-18)
* Upgrade to Pulumi v2.0.0
* Upgrade to pulumi-terraform-bridge v2.0.0

## 1.8.0 (2020-04-14)
* Upgrade to v1.78.0 of the AliCloud Terraform Provider

## 1.7.0 (2020-04-03)
* Upgrade to Pulumi v1.13.1
* Upgrade to pulumi-terraform-bridge v1.8.4
* Refactor layout to support Go modules

## 1.6.0 (2020-03-21)
* Upgrade to v1.75.0 of the AliCloud Terraform Provider

## 1.5.0 (2020-03-16)
* Upgrade to Pulumi v1.12.1
* Upgrade to pulumi-terraform-bridge v1.8.2

## 1.4.0 (2020-03-09)
* Upgrade to v1.72.0 of the AliCloud Terraform Provider

## v1.3.2 (2020-03-02)
* Upgrade to v1.71.2 of the AliCloud Terraform Provider

## v1.3.1 (2020-02-24)
* Upgrade to v1.71.1 of the AliCloud Terraform Provider

## 1.3.0 (2020-02-17)
* Upgrade to v1.71.0 of the AliCloud Terraform Provider

## 1.2.1 (2020-02-07)
* Upgrade to v1.70.3 of the AliCloud Terraform Provider

## 1.2.0 (2020-02-06)
* Upgrade to v1.70.2. of the AliCloud Terraform Provider

## 1.1.0 (2020-01-29)
* Upgrade to v1.70.1 of the AliCloud Terraform Provider
* Upgrade to v1.6.4 of pulumi-terraform-bridge

## 1.0.0 (2020-01-21)
* Initial release of the provider based on v1.70.0 of the AliCloud Terraform Provider
