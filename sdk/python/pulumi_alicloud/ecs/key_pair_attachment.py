# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins as _builtins
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from .. import _utilities

__all__ = ['KeyPairAttachmentArgs', 'KeyPairAttachment']

@pulumi.input_type
class KeyPairAttachmentArgs:
    def __init__(__self__, *,
                 instance_ids: pulumi.Input[Sequence[pulumi.Input[_builtins.str]]],
                 force: Optional[pulumi.Input[_builtins.bool]] = None,
                 key_name: Optional[pulumi.Input[_builtins.str]] = None,
                 key_pair_name: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a KeyPairAttachment resource.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] instance_ids: The list of ECS instance's IDs.
        :param pulumi.Input[_builtins.bool] force: Set it to true and it will reboot instances which attached with the key pair to make key pair affect immediately.
        :param pulumi.Input[_builtins.str] key_name: The name of key pair used to bind.
        """
        pulumi.set(__self__, "instance_ids", instance_ids)
        if force is not None:
            pulumi.set(__self__, "force", force)
        if key_name is not None:
            warnings.warn("""Field 'key_name' has been deprecated from provider version 1.121.0. New field 'key_pair_name' instead.""", DeprecationWarning)
            pulumi.log.warn("""key_name is deprecated: Field 'key_name' has been deprecated from provider version 1.121.0. New field 'key_pair_name' instead.""")
        if key_name is not None:
            pulumi.set(__self__, "key_name", key_name)
        if key_pair_name is not None:
            pulumi.set(__self__, "key_pair_name", key_pair_name)

    @_builtins.property
    @pulumi.getter(name="instanceIds")
    def instance_ids(self) -> pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]:
        """
        The list of ECS instance's IDs.
        """
        return pulumi.get(self, "instance_ids")

    @instance_ids.setter
    def instance_ids(self, value: pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]):
        pulumi.set(self, "instance_ids", value)

    @_builtins.property
    @pulumi.getter
    def force(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Set it to true and it will reboot instances which attached with the key pair to make key pair affect immediately.
        """
        return pulumi.get(self, "force")

    @force.setter
    def force(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "force", value)

    @_builtins.property
    @pulumi.getter(name="keyName")
    @_utilities.deprecated("""Field 'key_name' has been deprecated from provider version 1.121.0. New field 'key_pair_name' instead.""")
    def key_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of key pair used to bind.
        """
        return pulumi.get(self, "key_name")

    @key_name.setter
    def key_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "key_name", value)

    @_builtins.property
    @pulumi.getter(name="keyPairName")
    def key_pair_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "key_pair_name")

    @key_pair_name.setter
    def key_pair_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "key_pair_name", value)


@pulumi.input_type
class _KeyPairAttachmentState:
    def __init__(__self__, *,
                 force: Optional[pulumi.Input[_builtins.bool]] = None,
                 instance_ids: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 key_name: Optional[pulumi.Input[_builtins.str]] = None,
                 key_pair_name: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering KeyPairAttachment resources.
        :param pulumi.Input[_builtins.bool] force: Set it to true and it will reboot instances which attached with the key pair to make key pair affect immediately.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] instance_ids: The list of ECS instance's IDs.
        :param pulumi.Input[_builtins.str] key_name: The name of key pair used to bind.
        """
        if force is not None:
            pulumi.set(__self__, "force", force)
        if instance_ids is not None:
            pulumi.set(__self__, "instance_ids", instance_ids)
        if key_name is not None:
            warnings.warn("""Field 'key_name' has been deprecated from provider version 1.121.0. New field 'key_pair_name' instead.""", DeprecationWarning)
            pulumi.log.warn("""key_name is deprecated: Field 'key_name' has been deprecated from provider version 1.121.0. New field 'key_pair_name' instead.""")
        if key_name is not None:
            pulumi.set(__self__, "key_name", key_name)
        if key_pair_name is not None:
            pulumi.set(__self__, "key_pair_name", key_pair_name)

    @_builtins.property
    @pulumi.getter
    def force(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Set it to true and it will reboot instances which attached with the key pair to make key pair affect immediately.
        """
        return pulumi.get(self, "force")

    @force.setter
    def force(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "force", value)

    @_builtins.property
    @pulumi.getter(name="instanceIds")
    def instance_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        The list of ECS instance's IDs.
        """
        return pulumi.get(self, "instance_ids")

    @instance_ids.setter
    def instance_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "instance_ids", value)

    @_builtins.property
    @pulumi.getter(name="keyName")
    @_utilities.deprecated("""Field 'key_name' has been deprecated from provider version 1.121.0. New field 'key_pair_name' instead.""")
    def key_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of key pair used to bind.
        """
        return pulumi.get(self, "key_name")

    @key_name.setter
    def key_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "key_name", value)

    @_builtins.property
    @pulumi.getter(name="keyPairName")
    def key_pair_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "key_pair_name")

    @key_pair_name.setter
    def key_pair_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "key_pair_name", value)


@pulumi.type_token("alicloud:ecs/keyPairAttachment:KeyPairAttachment")
class KeyPairAttachment(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 force: Optional[pulumi.Input[_builtins.bool]] = None,
                 instance_ids: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 key_name: Optional[pulumi.Input[_builtins.str]] = None,
                 key_pair_name: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        > **DEPRECATED:** This resource has been renamed to ecs.EcsKeyPairAttachment from version 1.121.0.

        Provides a key pair attachment resource to bind key pair for several ECS instances.

        > **NOTE:** After the key pair is attached with sone instances, there instances must be rebooted to make the key pair affect.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.bool] force: Set it to true and it will reboot instances which attached with the key pair to make key pair affect immediately.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] instance_ids: The list of ECS instance's IDs.
        :param pulumi.Input[_builtins.str] key_name: The name of key pair used to bind.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: KeyPairAttachmentArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        > **DEPRECATED:** This resource has been renamed to ecs.EcsKeyPairAttachment from version 1.121.0.

        Provides a key pair attachment resource to bind key pair for several ECS instances.

        > **NOTE:** After the key pair is attached with sone instances, there instances must be rebooted to make the key pair affect.

        :param str resource_name: The name of the resource.
        :param KeyPairAttachmentArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(KeyPairAttachmentArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 force: Optional[pulumi.Input[_builtins.bool]] = None,
                 instance_ids: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 key_name: Optional[pulumi.Input[_builtins.str]] = None,
                 key_pair_name: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = KeyPairAttachmentArgs.__new__(KeyPairAttachmentArgs)

            __props__.__dict__["force"] = force
            if instance_ids is None and not opts.urn:
                raise TypeError("Missing required property 'instance_ids'")
            __props__.__dict__["instance_ids"] = instance_ids
            __props__.__dict__["key_name"] = key_name
            __props__.__dict__["key_pair_name"] = key_pair_name
        super(KeyPairAttachment, __self__).__init__(
            'alicloud:ecs/keyPairAttachment:KeyPairAttachment',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            force: Optional[pulumi.Input[_builtins.bool]] = None,
            instance_ids: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
            key_name: Optional[pulumi.Input[_builtins.str]] = None,
            key_pair_name: Optional[pulumi.Input[_builtins.str]] = None) -> 'KeyPairAttachment':
        """
        Get an existing KeyPairAttachment resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.bool] force: Set it to true and it will reboot instances which attached with the key pair to make key pair affect immediately.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] instance_ids: The list of ECS instance's IDs.
        :param pulumi.Input[_builtins.str] key_name: The name of key pair used to bind.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _KeyPairAttachmentState.__new__(_KeyPairAttachmentState)

        __props__.__dict__["force"] = force
        __props__.__dict__["instance_ids"] = instance_ids
        __props__.__dict__["key_name"] = key_name
        __props__.__dict__["key_pair_name"] = key_pair_name
        return KeyPairAttachment(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def force(self) -> pulumi.Output[Optional[_builtins.bool]]:
        """
        Set it to true and it will reboot instances which attached with the key pair to make key pair affect immediately.
        """
        return pulumi.get(self, "force")

    @_builtins.property
    @pulumi.getter(name="instanceIds")
    def instance_ids(self) -> pulumi.Output[Sequence[_builtins.str]]:
        """
        The list of ECS instance's IDs.
        """
        return pulumi.get(self, "instance_ids")

    @_builtins.property
    @pulumi.getter(name="keyName")
    @_utilities.deprecated("""Field 'key_name' has been deprecated from provider version 1.121.0. New field 'key_pair_name' instead.""")
    def key_name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of key pair used to bind.
        """
        return pulumi.get(self, "key_name")

    @_builtins.property
    @pulumi.getter(name="keyPairName")
    def key_pair_name(self) -> pulumi.Output[_builtins.str]:
        return pulumi.get(self, "key_pair_name")

