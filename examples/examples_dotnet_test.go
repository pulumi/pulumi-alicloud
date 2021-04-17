// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.
// +build dotnet all

package examples

import (
	"path"
	"testing"

	"github.com/pulumi/pulumi/pkg/v3/testing/integration"
)

func TestAccVpcCsharp(t *testing.T) {
	test := getCsharpBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: path.Join(getCwd(t), "vpc", "csharp"),
		})

	integration.ProgramTest(t, &test)
}

func getCsharpBaseOptions(t *testing.T) integration.ProgramTestOptions {
	region := getRegion(t)
	base := getBaseOptions()
	baseCsharp := base.With(integration.ProgramTestOptions{
		Config: map[string]string{
			"alicloud:region": region,
		},
		Dependencies: []string{
			"Pulumi.AliCloud",
		},
	})

	return baseCsharp
}
