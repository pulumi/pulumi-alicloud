// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package threatdetection

import (
	"fmt"

	"github.com/blang/semver"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type module struct {
	version semver.Version
}

func (m *module) Version() semver.Version {
	return m.version
}

func (m *module) Construct(ctx *pulumi.Context, name, typ, urn string) (r pulumi.Resource, err error) {
	switch typ {
	case "alicloud:threatdetection/antiBruteForceRule:AntiBruteForceRule":
		r = &AntiBruteForceRule{}
	case "alicloud:threatdetection/backupPolicy:BackupPolicy":
		r = &BackupPolicy{}
	case "alicloud:threatdetection/baselineStrategy:BaselineStrategy":
		r = &BaselineStrategy{}
	case "alicloud:threatdetection/honeyPot:HoneyPot":
		r = &HoneyPot{}
	case "alicloud:threatdetection/honeypotNode:HoneypotNode":
		r = &HoneypotNode{}
	case "alicloud:threatdetection/honeypotPreset:HoneypotPreset":
		r = &HoneypotPreset{}
	case "alicloud:threatdetection/honeypotProbe:HoneypotProbe":
		r = &HoneypotProbe{}
	case "alicloud:threatdetection/vulWhitelist:VulWhitelist":
		r = &VulWhitelist{}
	case "alicloud:threatdetection/webLockConfig:WebLockConfig":
		r = &WebLockConfig{}
	default:
		return nil, fmt.Errorf("unknown resource type: %s", typ)
	}

	err = ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return
}

func init() {
	version, err := alicloud.PkgVersion()
	if err != nil {
		version = semver.Version{Major: 1}
	}
	pulumi.RegisterResourceModule(
		"alicloud",
		"threatdetection/antiBruteForceRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"threatdetection/backupPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"threatdetection/baselineStrategy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"threatdetection/honeyPot",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"threatdetection/honeypotNode",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"threatdetection/honeypotPreset",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"threatdetection/honeypotProbe",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"threatdetection/vulWhitelist",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"threatdetection/webLockConfig",
		&module{version},
	)
}