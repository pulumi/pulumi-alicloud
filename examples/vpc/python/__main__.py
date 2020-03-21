from pulumi import export
import pulumi_alicloud as alicloud

vpc = alicloud.vpc.Network("my-python-vpc",
                            cidr_block="10.0.0.0/16")

export("vpc_id", vpc.id)
