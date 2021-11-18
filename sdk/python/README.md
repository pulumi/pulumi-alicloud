[![Actions Status](https://github.com/pulumi/pulumi-alicloud/workflows/master/badge.svg)](https://github.com/pulumi/pulumi-alicloud/actions)
[![Slack](http://www.pulumi.com/images/docs/badges/slack.svg)](https://slack.pulumi.com)
[![NPM version](https://badge.fury.io/js/%40pulumi%2Falicloud.svg)](https://www.npmjs.com/package/@pulumi/alicloud)
[![Python version](https://badge.fury.io/py/pulumi-alicloud.svg)](https://pypi.org/project/pulumi-alicloud)
[![NuGet version](https://badge.fury.io/nu/pulumi.alicloud.svg)](https://badge.fury.io/nu/pulumi.alicloud)
[![PkgGoDev](https://pkg.go.dev/badge/github.com/pulumi/pulumi-alicloud/sdk/v3/go)](https://pkg.go.dev/github.com/pulumi/pulumi-alicloud/sdk/v3/go)
[![License](https://img.shields.io/npm/l/%40pulumi%2Fpulumi.svg)](https://github.com/pulumi/pulumi-alicloud/blob/master/LICENSE)

# AliCloud Resource Provider

The AliCloud resource provider for Pulumi lets you use AliCloud resources in your cloud programs.  To use
this package, please [install the Pulumi CLI first](https://pulumi.io/).

## Installing

This package is available in many languages in the standard packaging formats.

### Node.js (Java/TypeScript)

To use from JavaScript or TypeScript in Node.js, install using either `npm`:

    $ npm install @pulumi/alicloud

or `yarn`:

    $ yarn add @pulumi/alicloud

### Python

To use from Python, install using `pip`:

    $ pip install pulumi_alicloud

### Go

To use from Go, use `go get` to grab the latest version of the library

    $ go get github.com/pulumi/pulumi-alicloud/sdk/v3

### .NET

To use from .NET, install using `dotnet add package`:

    $ dotnet add package Pulumi.Alicloud

## Configuration

The following configuration points are available:

- `alicloud:accessKey` - (Required) This is the Alicloud access key. It must be provided, but it can also be sourced from
  the `ALICLOUD_ACCESS_KEY` environment variable.
- `alicloud:secretKey` - (Required) This is the Alicloud secret key. It must be provided, but it can also be sourced from
  the `ALICLOUD_SECRET_KEY` environment variable.
- `alicloud:securityToken` - (Optional) Alicloud Security Token Service. It can be sourced from the `ALICLOUD_SECURITY_TOKEN`
  environment variable.
- `alicloud:ecsRoleName` - (Optional) The RAM Role Name attached on a ECS instance for API operations. You can retrieve
  this from the 'Access Control' section of the Alibaba Cloud console. It can be sourced from the `ALICLOUD_ECS_ROLE_NAME`
  environment variable.
- `alicloud:region` - (Required) This is the Alicloud region. It must be provided, but it can also be sourced from the
  `ALICLOUD_REGION` environment variables.
- `alicloud:accountId` - (Optional) Alibaba Cloud Account ID. It is used by the Function Compute service and to
  connect router interfaces. If not provided, the provider will attempt to retrieve it automatically with STS GetCallerIdentity.
  It can be sourced from the `ALICLOUD_ACCOUNT_ID` environment variable.
- `alicloud:sharedCredentialsFile` - (Optional) This is the path to the shared credentials file. It can also be sourced
  from the `ALICLOUD_SHARED_CREDENTIALS_FILE` environment variable. If this is not set and a profile is specified, 
  `~/.aliyun/config.json` will be used.
- `alicloud:profile` - (Optional) This is the Alicloud profile name as set in the shared credentials file. It can also be
  sourced from the `ALICLOUD_PROFILE` environment variable. 
- `alicloud:skipRegionValidation` - (Optional) Skip static validation of region ID. Used by users of alternative
  AlibabaCloud-like APIs or users w/ access to regions that are not public (yet).


## Reference

For further information, please visit [the AliCloud provider docs](https://www.pulumi.com/docs/intro/cloud-providers/alicloud) or for detailed reference documentation, please visit [the API docs](https://www.pulumi.com/docs/reference/pkg/alicloud).
