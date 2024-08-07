# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'InstanceEcsListArgs',
]

@pulumi.input_type
class InstanceEcsListArgs:
    def __init__(__self__, *,
                 ecs_id: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] ecs_id: The ID of the ECS instance.
               
               The following arguments will be discarded. Please use new fields as soon as possible:
        """
        if ecs_id is not None:
            pulumi.set(__self__, "ecs_id", ecs_id)

    @property
    @pulumi.getter(name="ecsId")
    def ecs_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the ECS instance.

        The following arguments will be discarded. Please use new fields as soon as possible:
        """
        return pulumi.get(self, "ecs_id")

    @ecs_id.setter
    def ecs_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ecs_id", value)


