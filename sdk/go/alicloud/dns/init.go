// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dns

import (
	"fmt"

	"github.com/blang/semver"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
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
	case "alicloud:dns/accessStrategy:AccessStrategy":
		r = &AccessStrategy{}
	case "alicloud:dns/addressPool:AddressPool":
		r = &AddressPool{}
	case "alicloud:dns/alidnsDomain:AlidnsDomain":
		r = &AlidnsDomain{}
	case "alicloud:dns/alidnsDomainAttachment:AlidnsDomainAttachment":
		r = &AlidnsDomainAttachment{}
	case "alicloud:dns/alidnsInstance:AlidnsInstance":
		r = &AlidnsInstance{}
	case "alicloud:dns/alidnsRecord:AlidnsRecord":
		r = &AlidnsRecord{}
	case "alicloud:dns/customLine:CustomLine":
		r = &CustomLine{}
	case "alicloud:dns/ddosBgpInstance:DdosBgpInstance":
		r = &DdosBgpInstance{}
	case "alicloud:dns/ddosCooInstance:DdosCooInstance":
		r = &DdosCooInstance{}
	case "alicloud:dns/dnsDomain:DnsDomain":
		r = &DnsDomain{}
	case "alicloud:dns/domain:Domain":
		r = &Domain{}
	case "alicloud:dns/domainAttachment:DomainAttachment":
		r = &DomainAttachment{}
	case "alicloud:dns/domainGroup:DomainGroup":
		r = &DomainGroup{}
	case "alicloud:dns/group:Group":
		r = &Group{}
	case "alicloud:dns/gtmInstance:GtmInstance":
		r = &GtmInstance{}
	case "alicloud:dns/instance:Instance":
		r = &Instance{}
	case "alicloud:dns/monitorConfig:MonitorConfig":
		r = &MonitorConfig{}
	case "alicloud:dns/record:Record":
		r = &Record{}
	default:
		return nil, fmt.Errorf("unknown resource type: %s", typ)
	}

	err = ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return
}

func init() {
	version, err := internal.PkgVersion()
	if err != nil {
		version = semver.Version{Major: 1}
	}
	pulumi.RegisterResourceModule(
		"alicloud",
		"dns/accessStrategy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"dns/addressPool",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"dns/alidnsDomain",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"dns/alidnsDomainAttachment",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"dns/alidnsInstance",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"dns/alidnsRecord",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"dns/customLine",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"dns/ddosBgpInstance",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"dns/ddosCooInstance",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"dns/dnsDomain",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"dns/domain",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"dns/domainAttachment",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"dns/domainGroup",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"dns/group",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"dns/gtmInstance",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"dns/instance",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"dns/monitorConfig",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"dns/record",
		&module{version},
	)
}
