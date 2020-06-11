// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.
// +build python all

package examples

import (
	"path"
	"path/filepath"
	"testing"

	"github.com/pulumi/pulumi/pkg/v2/testing/integration"
)

func TestAccVpcPython(t *testing.T) {
	test := getPythonBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: path.Join(getCwd(t), "vpc", "python"),
		})

	integration.ProgramTest(t, &test)
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
