# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['TransitRouterEcrAttachmentArgs', 'TransitRouterEcrAttachment']

@pulumi.input_type
class TransitRouterEcrAttachmentArgs:
    def __init__(__self__, *,
                 ecr_id: pulumi.Input[str],
                 cen_id: Optional[pulumi.Input[str]] = None,
                 ecr_owner_id: Optional[pulumi.Input[int]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 transit_router_attachment_description: Optional[pulumi.Input[str]] = None,
                 transit_router_ecr_attachment_name: Optional[pulumi.Input[str]] = None,
                 transit_router_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a TransitRouterEcrAttachment resource.
        :param pulumi.Input[str] ecr_id: EcrId
        :param pulumi.Input[str] cen_id: CenId
        :param pulumi.Input[int] ecr_owner_id: EcrOwnerId
        :param pulumi.Input[Mapping[str, Any]] tags: The tag of the resource
        :param pulumi.Input[str] transit_router_attachment_description: TransitRouterAttachmentDescription
        :param pulumi.Input[str] transit_router_ecr_attachment_name: TransitRouterAttachmentName
        :param pulumi.Input[str] transit_router_id: TransitRouterId
        """
        pulumi.set(__self__, "ecr_id", ecr_id)
        if cen_id is not None:
            pulumi.set(__self__, "cen_id", cen_id)
        if ecr_owner_id is not None:
            pulumi.set(__self__, "ecr_owner_id", ecr_owner_id)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if transit_router_attachment_description is not None:
            pulumi.set(__self__, "transit_router_attachment_description", transit_router_attachment_description)
        if transit_router_ecr_attachment_name is not None:
            pulumi.set(__self__, "transit_router_ecr_attachment_name", transit_router_ecr_attachment_name)
        if transit_router_id is not None:
            pulumi.set(__self__, "transit_router_id", transit_router_id)

    @property
    @pulumi.getter(name="ecrId")
    def ecr_id(self) -> pulumi.Input[str]:
        """
        EcrId
        """
        return pulumi.get(self, "ecr_id")

    @ecr_id.setter
    def ecr_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "ecr_id", value)

    @property
    @pulumi.getter(name="cenId")
    def cen_id(self) -> Optional[pulumi.Input[str]]:
        """
        CenId
        """
        return pulumi.get(self, "cen_id")

    @cen_id.setter
    def cen_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cen_id", value)

    @property
    @pulumi.getter(name="ecrOwnerId")
    def ecr_owner_id(self) -> Optional[pulumi.Input[int]]:
        """
        EcrOwnerId
        """
        return pulumi.get(self, "ecr_owner_id")

    @ecr_owner_id.setter
    def ecr_owner_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "ecr_owner_id", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        The tag of the resource
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="transitRouterAttachmentDescription")
    def transit_router_attachment_description(self) -> Optional[pulumi.Input[str]]:
        """
        TransitRouterAttachmentDescription
        """
        return pulumi.get(self, "transit_router_attachment_description")

    @transit_router_attachment_description.setter
    def transit_router_attachment_description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "transit_router_attachment_description", value)

    @property
    @pulumi.getter(name="transitRouterEcrAttachmentName")
    def transit_router_ecr_attachment_name(self) -> Optional[pulumi.Input[str]]:
        """
        TransitRouterAttachmentName
        """
        return pulumi.get(self, "transit_router_ecr_attachment_name")

    @transit_router_ecr_attachment_name.setter
    def transit_router_ecr_attachment_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "transit_router_ecr_attachment_name", value)

    @property
    @pulumi.getter(name="transitRouterId")
    def transit_router_id(self) -> Optional[pulumi.Input[str]]:
        """
        TransitRouterId
        """
        return pulumi.get(self, "transit_router_id")

    @transit_router_id.setter
    def transit_router_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "transit_router_id", value)


@pulumi.input_type
class _TransitRouterEcrAttachmentState:
    def __init__(__self__, *,
                 cen_id: Optional[pulumi.Input[str]] = None,
                 create_time: Optional[pulumi.Input[str]] = None,
                 ecr_id: Optional[pulumi.Input[str]] = None,
                 ecr_owner_id: Optional[pulumi.Input[int]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 transit_router_attachment_description: Optional[pulumi.Input[str]] = None,
                 transit_router_ecr_attachment_name: Optional[pulumi.Input[str]] = None,
                 transit_router_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering TransitRouterEcrAttachment resources.
        :param pulumi.Input[str] cen_id: CenId
        :param pulumi.Input[str] create_time: The creation time of the resource
        :param pulumi.Input[str] ecr_id: EcrId
        :param pulumi.Input[int] ecr_owner_id: EcrOwnerId
        :param pulumi.Input[str] status: The status of the resource
        :param pulumi.Input[Mapping[str, Any]] tags: The tag of the resource
        :param pulumi.Input[str] transit_router_attachment_description: TransitRouterAttachmentDescription
        :param pulumi.Input[str] transit_router_ecr_attachment_name: TransitRouterAttachmentName
        :param pulumi.Input[str] transit_router_id: TransitRouterId
        """
        if cen_id is not None:
            pulumi.set(__self__, "cen_id", cen_id)
        if create_time is not None:
            pulumi.set(__self__, "create_time", create_time)
        if ecr_id is not None:
            pulumi.set(__self__, "ecr_id", ecr_id)
        if ecr_owner_id is not None:
            pulumi.set(__self__, "ecr_owner_id", ecr_owner_id)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if transit_router_attachment_description is not None:
            pulumi.set(__self__, "transit_router_attachment_description", transit_router_attachment_description)
        if transit_router_ecr_attachment_name is not None:
            pulumi.set(__self__, "transit_router_ecr_attachment_name", transit_router_ecr_attachment_name)
        if transit_router_id is not None:
            pulumi.set(__self__, "transit_router_id", transit_router_id)

    @property
    @pulumi.getter(name="cenId")
    def cen_id(self) -> Optional[pulumi.Input[str]]:
        """
        CenId
        """
        return pulumi.get(self, "cen_id")

    @cen_id.setter
    def cen_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cen_id", value)

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> Optional[pulumi.Input[str]]:
        """
        The creation time of the resource
        """
        return pulumi.get(self, "create_time")

    @create_time.setter
    def create_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "create_time", value)

    @property
    @pulumi.getter(name="ecrId")
    def ecr_id(self) -> Optional[pulumi.Input[str]]:
        """
        EcrId
        """
        return pulumi.get(self, "ecr_id")

    @ecr_id.setter
    def ecr_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ecr_id", value)

    @property
    @pulumi.getter(name="ecrOwnerId")
    def ecr_owner_id(self) -> Optional[pulumi.Input[int]]:
        """
        EcrOwnerId
        """
        return pulumi.get(self, "ecr_owner_id")

    @ecr_owner_id.setter
    def ecr_owner_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "ecr_owner_id", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The status of the resource
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        The tag of the resource
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="transitRouterAttachmentDescription")
    def transit_router_attachment_description(self) -> Optional[pulumi.Input[str]]:
        """
        TransitRouterAttachmentDescription
        """
        return pulumi.get(self, "transit_router_attachment_description")

    @transit_router_attachment_description.setter
    def transit_router_attachment_description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "transit_router_attachment_description", value)

    @property
    @pulumi.getter(name="transitRouterEcrAttachmentName")
    def transit_router_ecr_attachment_name(self) -> Optional[pulumi.Input[str]]:
        """
        TransitRouterAttachmentName
        """
        return pulumi.get(self, "transit_router_ecr_attachment_name")

    @transit_router_ecr_attachment_name.setter
    def transit_router_ecr_attachment_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "transit_router_ecr_attachment_name", value)

    @property
    @pulumi.getter(name="transitRouterId")
    def transit_router_id(self) -> Optional[pulumi.Input[str]]:
        """
        TransitRouterId
        """
        return pulumi.get(self, "transit_router_id")

    @transit_router_id.setter
    def transit_router_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "transit_router_id", value)


class TransitRouterEcrAttachment(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cen_id: Optional[pulumi.Input[str]] = None,
                 ecr_id: Optional[pulumi.Input[str]] = None,
                 ecr_owner_id: Optional[pulumi.Input[int]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 transit_router_attachment_description: Optional[pulumi.Input[str]] = None,
                 transit_router_ecr_attachment_name: Optional[pulumi.Input[str]] = None,
                 transit_router_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a CEN Transit Router Ecr Attachment resource.

        For information about CEN Transit Router Ecr Attachment and how to use it, see [What is Transit Router Ecr Attachment](https://www.alibabacloud.com/help/en/).

        > **NOTE:** Available since v1.226.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        asn = config.get("asn")
        if asn is None:
            asn = "4200000666"
        default_o8_hcfx = alicloud.expressconnect.RouterExpressConnectRouter("defaultO8Hcfx",
            alibaba_side_asn=asn,
            ecr_name=name)
        default_qk_biay = alicloud.cen.Instance("defaultQKBiay", cen_instance_name=name)
        default_qa94_y1 = alicloud.cen.TransitRouter("defaultQa94Y1",
            cen_id=default_qk_biay.id,
            transit_router_name=name)
        current = alicloud.get_account()
        defaulted_pu6c = alicloud.expressconnect.RouterTrAssociation("defaultedPu6c",
            association_region_id="cn-hangzhou",
            ecr_id=default_o8_hcfx.id,
            cen_id=default_qk_biay.id,
            transit_router_id=default_qa94_y1.transit_router_id,
            transit_router_owner_id=current.id)
        default = alicloud.cen.TransitRouterEcrAttachment("default",
            ecr_id=default_o8_hcfx.id,
            cen_id=defaulted_pu6c.cen_id,
            transit_router_ecr_attachment_name=name,
            transit_router_attachment_description=name,
            transit_router_id=default_qa94_y1.transit_router_id,
            ecr_owner_id=current.id)
        ```

        ## Import

        CEN Transit Router Ecr Attachment can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:cen/transitRouterEcrAttachment:TransitRouterEcrAttachment example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cen_id: CenId
        :param pulumi.Input[str] ecr_id: EcrId
        :param pulumi.Input[int] ecr_owner_id: EcrOwnerId
        :param pulumi.Input[Mapping[str, Any]] tags: The tag of the resource
        :param pulumi.Input[str] transit_router_attachment_description: TransitRouterAttachmentDescription
        :param pulumi.Input[str] transit_router_ecr_attachment_name: TransitRouterAttachmentName
        :param pulumi.Input[str] transit_router_id: TransitRouterId
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: TransitRouterEcrAttachmentArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a CEN Transit Router Ecr Attachment resource.

        For information about CEN Transit Router Ecr Attachment and how to use it, see [What is Transit Router Ecr Attachment](https://www.alibabacloud.com/help/en/).

        > **NOTE:** Available since v1.226.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        asn = config.get("asn")
        if asn is None:
            asn = "4200000666"
        default_o8_hcfx = alicloud.expressconnect.RouterExpressConnectRouter("defaultO8Hcfx",
            alibaba_side_asn=asn,
            ecr_name=name)
        default_qk_biay = alicloud.cen.Instance("defaultQKBiay", cen_instance_name=name)
        default_qa94_y1 = alicloud.cen.TransitRouter("defaultQa94Y1",
            cen_id=default_qk_biay.id,
            transit_router_name=name)
        current = alicloud.get_account()
        defaulted_pu6c = alicloud.expressconnect.RouterTrAssociation("defaultedPu6c",
            association_region_id="cn-hangzhou",
            ecr_id=default_o8_hcfx.id,
            cen_id=default_qk_biay.id,
            transit_router_id=default_qa94_y1.transit_router_id,
            transit_router_owner_id=current.id)
        default = alicloud.cen.TransitRouterEcrAttachment("default",
            ecr_id=default_o8_hcfx.id,
            cen_id=defaulted_pu6c.cen_id,
            transit_router_ecr_attachment_name=name,
            transit_router_attachment_description=name,
            transit_router_id=default_qa94_y1.transit_router_id,
            ecr_owner_id=current.id)
        ```

        ## Import

        CEN Transit Router Ecr Attachment can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:cen/transitRouterEcrAttachment:TransitRouterEcrAttachment example <id>
        ```

        :param str resource_name: The name of the resource.
        :param TransitRouterEcrAttachmentArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TransitRouterEcrAttachmentArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cen_id: Optional[pulumi.Input[str]] = None,
                 ecr_id: Optional[pulumi.Input[str]] = None,
                 ecr_owner_id: Optional[pulumi.Input[int]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 transit_router_attachment_description: Optional[pulumi.Input[str]] = None,
                 transit_router_ecr_attachment_name: Optional[pulumi.Input[str]] = None,
                 transit_router_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TransitRouterEcrAttachmentArgs.__new__(TransitRouterEcrAttachmentArgs)

            __props__.__dict__["cen_id"] = cen_id
            if ecr_id is None and not opts.urn:
                raise TypeError("Missing required property 'ecr_id'")
            __props__.__dict__["ecr_id"] = ecr_id
            __props__.__dict__["ecr_owner_id"] = ecr_owner_id
            __props__.__dict__["tags"] = tags
            __props__.__dict__["transit_router_attachment_description"] = transit_router_attachment_description
            __props__.__dict__["transit_router_ecr_attachment_name"] = transit_router_ecr_attachment_name
            __props__.__dict__["transit_router_id"] = transit_router_id
            __props__.__dict__["create_time"] = None
            __props__.__dict__["status"] = None
        super(TransitRouterEcrAttachment, __self__).__init__(
            'alicloud:cen/transitRouterEcrAttachment:TransitRouterEcrAttachment',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            cen_id: Optional[pulumi.Input[str]] = None,
            create_time: Optional[pulumi.Input[str]] = None,
            ecr_id: Optional[pulumi.Input[str]] = None,
            ecr_owner_id: Optional[pulumi.Input[int]] = None,
            status: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            transit_router_attachment_description: Optional[pulumi.Input[str]] = None,
            transit_router_ecr_attachment_name: Optional[pulumi.Input[str]] = None,
            transit_router_id: Optional[pulumi.Input[str]] = None) -> 'TransitRouterEcrAttachment':
        """
        Get an existing TransitRouterEcrAttachment resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cen_id: CenId
        :param pulumi.Input[str] create_time: The creation time of the resource
        :param pulumi.Input[str] ecr_id: EcrId
        :param pulumi.Input[int] ecr_owner_id: EcrOwnerId
        :param pulumi.Input[str] status: The status of the resource
        :param pulumi.Input[Mapping[str, Any]] tags: The tag of the resource
        :param pulumi.Input[str] transit_router_attachment_description: TransitRouterAttachmentDescription
        :param pulumi.Input[str] transit_router_ecr_attachment_name: TransitRouterAttachmentName
        :param pulumi.Input[str] transit_router_id: TransitRouterId
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TransitRouterEcrAttachmentState.__new__(_TransitRouterEcrAttachmentState)

        __props__.__dict__["cen_id"] = cen_id
        __props__.__dict__["create_time"] = create_time
        __props__.__dict__["ecr_id"] = ecr_id
        __props__.__dict__["ecr_owner_id"] = ecr_owner_id
        __props__.__dict__["status"] = status
        __props__.__dict__["tags"] = tags
        __props__.__dict__["transit_router_attachment_description"] = transit_router_attachment_description
        __props__.__dict__["transit_router_ecr_attachment_name"] = transit_router_ecr_attachment_name
        __props__.__dict__["transit_router_id"] = transit_router_id
        return TransitRouterEcrAttachment(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="cenId")
    def cen_id(self) -> pulumi.Output[Optional[str]]:
        """
        CenId
        """
        return pulumi.get(self, "cen_id")

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> pulumi.Output[str]:
        """
        The creation time of the resource
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter(name="ecrId")
    def ecr_id(self) -> pulumi.Output[str]:
        """
        EcrId
        """
        return pulumi.get(self, "ecr_id")

    @property
    @pulumi.getter(name="ecrOwnerId")
    def ecr_owner_id(self) -> pulumi.Output[Optional[int]]:
        """
        EcrOwnerId
        """
        return pulumi.get(self, "ecr_owner_id")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The status of the resource
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, Any]]]:
        """
        The tag of the resource
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="transitRouterAttachmentDescription")
    def transit_router_attachment_description(self) -> pulumi.Output[Optional[str]]:
        """
        TransitRouterAttachmentDescription
        """
        return pulumi.get(self, "transit_router_attachment_description")

    @property
    @pulumi.getter(name="transitRouterEcrAttachmentName")
    def transit_router_ecr_attachment_name(self) -> pulumi.Output[Optional[str]]:
        """
        TransitRouterAttachmentName
        """
        return pulumi.get(self, "transit_router_ecr_attachment_name")

    @property
    @pulumi.getter(name="transitRouterId")
    def transit_router_id(self) -> pulumi.Output[Optional[str]]:
        """
        TransitRouterId
        """
        return pulumi.get(self, "transit_router_id")
