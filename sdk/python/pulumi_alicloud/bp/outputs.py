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
    'StudioApplicationInstance',
    'GetStudioApplicationsApplicationResult',
]

@pulumi.output_type
class StudioApplicationInstance(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "nodeName":
            suggest = "node_name"
        elif key == "nodeType":
            suggest = "node_type"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in StudioApplicationInstance. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        StudioApplicationInstance.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        StudioApplicationInstance.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 id: Optional[str] = None,
                 node_name: Optional[str] = None,
                 node_type: Optional[str] = None):
        """
        :param str id: The id of the instance.
        :param str node_name: The name of the instance.
        :param str node_type: The type of the instance.
        """
        if id is not None:
            pulumi.set(__self__, "id", id)
        if node_name is not None:
            pulumi.set(__self__, "node_name", node_name)
        if node_type is not None:
            pulumi.set(__self__, "node_type", node_type)

    @property
    @pulumi.getter
    def id(self) -> Optional[str]:
        """
        The id of the instance.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="nodeName")
    def node_name(self) -> Optional[str]:
        """
        The name of the instance.
        """
        return pulumi.get(self, "node_name")

    @property
    @pulumi.getter(name="nodeType")
    def node_type(self) -> Optional[str]:
        """
        The type of the instance.
        """
        return pulumi.get(self, "node_type")


@pulumi.output_type
class GetStudioApplicationsApplicationResult(dict):
    def __init__(__self__, *,
                 application_id: str,
                 application_name: str,
                 create_time: str,
                 id: str,
                 image_url: str,
                 resource_group_id: str,
                 status: str,
                 topo_url: str):
        """
        :param str application_id: The ID of the Application.
        :param str application_name: The name of the Application.
        :param str create_time: The creation time of the Application.
        :param str id: The ID of the Application.
        :param str image_url: The image url of the Application.
        :param str resource_group_id: The ID of the resource group.
        :param str status: The status of the Application. Valid values: `success`, `release`.
        :param str topo_url: The topo url of the Application.
        """
        pulumi.set(__self__, "application_id", application_id)
        pulumi.set(__self__, "application_name", application_name)
        pulumi.set(__self__, "create_time", create_time)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "image_url", image_url)
        pulumi.set(__self__, "resource_group_id", resource_group_id)
        pulumi.set(__self__, "status", status)
        pulumi.set(__self__, "topo_url", topo_url)

    @property
    @pulumi.getter(name="applicationId")
    def application_id(self) -> str:
        """
        The ID of the Application.
        """
        return pulumi.get(self, "application_id")

    @property
    @pulumi.getter(name="applicationName")
    def application_name(self) -> str:
        """
        The name of the Application.
        """
        return pulumi.get(self, "application_name")

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> str:
        """
        The creation time of the Application.
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of the Application.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="imageUrl")
    def image_url(self) -> str:
        """
        The image url of the Application.
        """
        return pulumi.get(self, "image_url")

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> str:
        """
        The ID of the resource group.
        """
        return pulumi.get(self, "resource_group_id")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        The status of the Application. Valid values: `success`, `release`.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="topoUrl")
    def topo_url(self) -> str:
        """
        The topo url of the Application.
        """
        return pulumi.get(self, "topo_url")

