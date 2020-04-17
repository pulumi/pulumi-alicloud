import * as alicloud from "@pulumi/alicloud";

const vpc = new alicloud.vpc.Network("my-ts-vpc", {
    cidrBlock: "10.0.0.0/16",
});

export const vpcId = vpc.id;