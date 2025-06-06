// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package aligreen

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
	case "alicloud:aligreen/auditCallback:AuditCallback":
		r = &AuditCallback{}
	case "alicloud:aligreen/bizType:BizType":
		r = &BizType{}
	case "alicloud:aligreen/callback:Callback":
		r = &Callback{}
	case "alicloud:aligreen/imageLib:ImageLib":
		r = &ImageLib{}
	case "alicloud:aligreen/keywordLib:KeywordLib":
		r = &KeywordLib{}
	case "alicloud:aligreen/ossStockTask:OssStockTask":
		r = &OssStockTask{}
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
		"aligreen/auditCallback",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"aligreen/bizType",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"aligreen/callback",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"aligreen/imageLib",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"aligreen/keywordLib",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"aligreen/ossStockTask",
		&module{version},
	)
}
