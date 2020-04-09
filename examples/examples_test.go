// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.

package examples

import (
	"os"
	"path"
	"path/filepath"
	"testing"

	"github.com/pulumi/pulumi/pkg/v2/testing/integration"
)

func TestAccVpcTs(t *testing.T) {
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: path.Join(getCwd(t), "vpc", "ts"),
		})

	integration.ProgramTest(t, &test)
}

func TestAccVpcPython(t *testing.T) {
	test := getPythonBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: path.Join(getCwd(t), "vpc", "python"),
		})

	integration.ProgramTest(t, &test)
}

func TestAccVpcCsharp(t *testing.T) {
	test := getCsharpBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: path.Join(getCwd(t), "vpc", "csharp"),
		})

	integration.ProgramTest(t, &test)
}

func getJSBaseOptions(t *testing.T) integration.ProgramTestOptions {
	region := getRegion(t)
	base := getBaseOptions()
	baseJS := base.With(integration.ProgramTestOptions{
		Config: map[string]string{
			"alicloud:region": region,
		},
		Dependencies: []string{
			"@pulumi/alicloud",
		},
	})

	return baseJS
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

func getPythonBaseOptions(t *testing.T) integration.ProgramTestOptions {
	region := getRegion(t)
	base := getBaseOptions()
	basePython := base.With(integration.ProgramTestOptions{
		Config: map[string]string{
			"alicloud:region": region,
		},
		Dependencies: []string{
			filepath.Join("..", "sdk", "python", "bin"),
		},
	})

	return basePython
}

func getRegion(t *testing.T) string {
	region := os.Getenv("ALICLOUD_REGION")
	if region == "" {
		t.Skipf("Skipping test due to missing ALICLOUD_REGION environment variable")
	}

	return region
}

func getCwd(t *testing.T) string {
	cwd, err := os.Getwd()
	if err != nil {
		t.FailNow()
	}

	return cwd
}

func getBaseOptions() integration.ProgramTestOptions {
	return integration.ProgramTestOptions{
		ExpectRefreshChanges: true,
		SkipRefresh:          true,
		Quick:                true,
	}
}
