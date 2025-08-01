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

__all__ = ['ReplicationVaultArgs', 'ReplicationVault']

@pulumi.input_type
class ReplicationVaultArgs:
    def __init__(__self__, *,
                 replication_source_region_id: pulumi.Input[_builtins.str],
                 replication_source_vault_id: pulumi.Input[_builtins.str],
                 vault_name: pulumi.Input[_builtins.str],
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 encrypt_type: Optional[pulumi.Input[_builtins.str]] = None,
                 kms_key_id: Optional[pulumi.Input[_builtins.str]] = None,
                 vault_storage_class: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a ReplicationVault resource.
        :param pulumi.Input[_builtins.str] replication_source_region_id: The region ID of the source backup vault.
        :param pulumi.Input[_builtins.str] replication_source_vault_id: The vault ID of the source backup vault.
        :param pulumi.Input[_builtins.str] vault_name: The name of the backup vault.
        :param pulumi.Input[_builtins.str] description: The description of the backup vault.
        :param pulumi.Input[_builtins.str] encrypt_type: The encryption type of the backup vault.
        :param pulumi.Input[_builtins.str] kms_key_id: Alibaba Cloud KMS custom Key or Alias. This parameter is required only when EncryptType = KMS.
        :param pulumi.Input[_builtins.str] vault_storage_class: Backup Vault Storage Class
        """
        pulumi.set(__self__, "replication_source_region_id", replication_source_region_id)
        pulumi.set(__self__, "replication_source_vault_id", replication_source_vault_id)
        pulumi.set(__self__, "vault_name", vault_name)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if encrypt_type is not None:
            pulumi.set(__self__, "encrypt_type", encrypt_type)
        if kms_key_id is not None:
            pulumi.set(__self__, "kms_key_id", kms_key_id)
        if vault_storage_class is not None:
            pulumi.set(__self__, "vault_storage_class", vault_storage_class)

    @_builtins.property
    @pulumi.getter(name="replicationSourceRegionId")
    def replication_source_region_id(self) -> pulumi.Input[_builtins.str]:
        """
        The region ID of the source backup vault.
        """
        return pulumi.get(self, "replication_source_region_id")

    @replication_source_region_id.setter
    def replication_source_region_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "replication_source_region_id", value)

    @_builtins.property
    @pulumi.getter(name="replicationSourceVaultId")
    def replication_source_vault_id(self) -> pulumi.Input[_builtins.str]:
        """
        The vault ID of the source backup vault.
        """
        return pulumi.get(self, "replication_source_vault_id")

    @replication_source_vault_id.setter
    def replication_source_vault_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "replication_source_vault_id", value)

    @_builtins.property
    @pulumi.getter(name="vaultName")
    def vault_name(self) -> pulumi.Input[_builtins.str]:
        """
        The name of the backup vault.
        """
        return pulumi.get(self, "vault_name")

    @vault_name.setter
    def vault_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "vault_name", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The description of the backup vault.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter(name="encryptType")
    def encrypt_type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The encryption type of the backup vault.
        """
        return pulumi.get(self, "encrypt_type")

    @encrypt_type.setter
    def encrypt_type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "encrypt_type", value)

    @_builtins.property
    @pulumi.getter(name="kmsKeyId")
    def kms_key_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Alibaba Cloud KMS custom Key or Alias. This parameter is required only when EncryptType = KMS.
        """
        return pulumi.get(self, "kms_key_id")

    @kms_key_id.setter
    def kms_key_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "kms_key_id", value)

    @_builtins.property
    @pulumi.getter(name="vaultStorageClass")
    def vault_storage_class(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Backup Vault Storage Class
        """
        return pulumi.get(self, "vault_storage_class")

    @vault_storage_class.setter
    def vault_storage_class(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "vault_storage_class", value)


@pulumi.input_type
class _ReplicationVaultState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 encrypt_type: Optional[pulumi.Input[_builtins.str]] = None,
                 kms_key_id: Optional[pulumi.Input[_builtins.str]] = None,
                 region_id: Optional[pulumi.Input[_builtins.str]] = None,
                 replication_source_region_id: Optional[pulumi.Input[_builtins.str]] = None,
                 replication_source_vault_id: Optional[pulumi.Input[_builtins.str]] = None,
                 status: Optional[pulumi.Input[_builtins.str]] = None,
                 vault_name: Optional[pulumi.Input[_builtins.str]] = None,
                 vault_storage_class: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering ReplicationVault resources.
        :param pulumi.Input[_builtins.str] description: The description of the backup vault.
        :param pulumi.Input[_builtins.str] encrypt_type: The encryption type of the backup vault.
        :param pulumi.Input[_builtins.str] kms_key_id: Alibaba Cloud KMS custom Key or Alias. This parameter is required only when EncryptType = KMS.
        :param pulumi.Input[_builtins.str] region_id: RegionId
        :param pulumi.Input[_builtins.str] replication_source_region_id: The region ID of the source backup vault.
        :param pulumi.Input[_builtins.str] replication_source_vault_id: The vault ID of the source backup vault.
        :param pulumi.Input[_builtins.str] status: The status of the mirror backup vault.
        :param pulumi.Input[_builtins.str] vault_name: The name of the backup vault.
        :param pulumi.Input[_builtins.str] vault_storage_class: Backup Vault Storage Class
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if encrypt_type is not None:
            pulumi.set(__self__, "encrypt_type", encrypt_type)
        if kms_key_id is not None:
            pulumi.set(__self__, "kms_key_id", kms_key_id)
        if region_id is not None:
            pulumi.set(__self__, "region_id", region_id)
        if replication_source_region_id is not None:
            pulumi.set(__self__, "replication_source_region_id", replication_source_region_id)
        if replication_source_vault_id is not None:
            pulumi.set(__self__, "replication_source_vault_id", replication_source_vault_id)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if vault_name is not None:
            pulumi.set(__self__, "vault_name", vault_name)
        if vault_storage_class is not None:
            pulumi.set(__self__, "vault_storage_class", vault_storage_class)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The description of the backup vault.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter(name="encryptType")
    def encrypt_type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The encryption type of the backup vault.
        """
        return pulumi.get(self, "encrypt_type")

    @encrypt_type.setter
    def encrypt_type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "encrypt_type", value)

    @_builtins.property
    @pulumi.getter(name="kmsKeyId")
    def kms_key_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Alibaba Cloud KMS custom Key or Alias. This parameter is required only when EncryptType = KMS.
        """
        return pulumi.get(self, "kms_key_id")

    @kms_key_id.setter
    def kms_key_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "kms_key_id", value)

    @_builtins.property
    @pulumi.getter(name="regionId")
    def region_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        RegionId
        """
        return pulumi.get(self, "region_id")

    @region_id.setter
    def region_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "region_id", value)

    @_builtins.property
    @pulumi.getter(name="replicationSourceRegionId")
    def replication_source_region_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The region ID of the source backup vault.
        """
        return pulumi.get(self, "replication_source_region_id")

    @replication_source_region_id.setter
    def replication_source_region_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "replication_source_region_id", value)

    @_builtins.property
    @pulumi.getter(name="replicationSourceVaultId")
    def replication_source_vault_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The vault ID of the source backup vault.
        """
        return pulumi.get(self, "replication_source_vault_id")

    @replication_source_vault_id.setter
    def replication_source_vault_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "replication_source_vault_id", value)

    @_builtins.property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The status of the mirror backup vault.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "status", value)

    @_builtins.property
    @pulumi.getter(name="vaultName")
    def vault_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the backup vault.
        """
        return pulumi.get(self, "vault_name")

    @vault_name.setter
    def vault_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "vault_name", value)

    @_builtins.property
    @pulumi.getter(name="vaultStorageClass")
    def vault_storage_class(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Backup Vault Storage Class
        """
        return pulumi.get(self, "vault_storage_class")

    @vault_storage_class.setter
    def vault_storage_class(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "vault_storage_class", value)


@pulumi.type_token("alicloud:hbr/replicationVault:ReplicationVault")
class ReplicationVault(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 encrypt_type: Optional[pulumi.Input[_builtins.str]] = None,
                 kms_key_id: Optional[pulumi.Input[_builtins.str]] = None,
                 replication_source_region_id: Optional[pulumi.Input[_builtins.str]] = None,
                 replication_source_vault_id: Optional[pulumi.Input[_builtins.str]] = None,
                 vault_name: Optional[pulumi.Input[_builtins.str]] = None,
                 vault_storage_class: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Provides a Hybrid Backup Recovery (HBR) Replication Vault resource.

        The replication vault used by the cross-region backup function of Cloud Backup.

        For information about Hybrid Backup Recovery (HBR) Replication Vault and how to use it, see [What is Replication Vault](https://www.alibabacloud.com/help/en/doc-detail/345603.html).

        > **NOTE:** Available since v1.252.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud
        import pulumi_random as random

        config = pulumi.Config()
        source_region = config.get("sourceRegion")
        if source_region is None:
            source_region = "cn-hangzhou"
        default = alicloud.hbr.get_replication_vault_regions()
        default_integer = random.index.Integer("default",
            min=10000,
            max=99999)
        default_vault = alicloud.hbr.Vault("default", vault_name=f"terraform-example-{default_integer['result']}")
        default_replication_vault = alicloud.hbr.ReplicationVault("default",
            replication_source_region_id=source_region,
            replication_source_vault_id=default_vault.id,
            vault_name="terraform-example",
            vault_storage_class="STANDARD",
            description="terraform-example")
        ```

        ## Import

        Hybrid Backup Recovery (HBR) Replication Vault can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:hbr/replicationVault:ReplicationVault example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] description: The description of the backup vault.
        :param pulumi.Input[_builtins.str] encrypt_type: The encryption type of the backup vault.
        :param pulumi.Input[_builtins.str] kms_key_id: Alibaba Cloud KMS custom Key or Alias. This parameter is required only when EncryptType = KMS.
        :param pulumi.Input[_builtins.str] replication_source_region_id: The region ID of the source backup vault.
        :param pulumi.Input[_builtins.str] replication_source_vault_id: The vault ID of the source backup vault.
        :param pulumi.Input[_builtins.str] vault_name: The name of the backup vault.
        :param pulumi.Input[_builtins.str] vault_storage_class: Backup Vault Storage Class
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ReplicationVaultArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Hybrid Backup Recovery (HBR) Replication Vault resource.

        The replication vault used by the cross-region backup function of Cloud Backup.

        For information about Hybrid Backup Recovery (HBR) Replication Vault and how to use it, see [What is Replication Vault](https://www.alibabacloud.com/help/en/doc-detail/345603.html).

        > **NOTE:** Available since v1.252.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud
        import pulumi_random as random

        config = pulumi.Config()
        source_region = config.get("sourceRegion")
        if source_region is None:
            source_region = "cn-hangzhou"
        default = alicloud.hbr.get_replication_vault_regions()
        default_integer = random.index.Integer("default",
            min=10000,
            max=99999)
        default_vault = alicloud.hbr.Vault("default", vault_name=f"terraform-example-{default_integer['result']}")
        default_replication_vault = alicloud.hbr.ReplicationVault("default",
            replication_source_region_id=source_region,
            replication_source_vault_id=default_vault.id,
            vault_name="terraform-example",
            vault_storage_class="STANDARD",
            description="terraform-example")
        ```

        ## Import

        Hybrid Backup Recovery (HBR) Replication Vault can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:hbr/replicationVault:ReplicationVault example <id>
        ```

        :param str resource_name: The name of the resource.
        :param ReplicationVaultArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ReplicationVaultArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 encrypt_type: Optional[pulumi.Input[_builtins.str]] = None,
                 kms_key_id: Optional[pulumi.Input[_builtins.str]] = None,
                 replication_source_region_id: Optional[pulumi.Input[_builtins.str]] = None,
                 replication_source_vault_id: Optional[pulumi.Input[_builtins.str]] = None,
                 vault_name: Optional[pulumi.Input[_builtins.str]] = None,
                 vault_storage_class: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ReplicationVaultArgs.__new__(ReplicationVaultArgs)

            __props__.__dict__["description"] = description
            __props__.__dict__["encrypt_type"] = encrypt_type
            __props__.__dict__["kms_key_id"] = kms_key_id
            if replication_source_region_id is None and not opts.urn:
                raise TypeError("Missing required property 'replication_source_region_id'")
            __props__.__dict__["replication_source_region_id"] = replication_source_region_id
            if replication_source_vault_id is None and not opts.urn:
                raise TypeError("Missing required property 'replication_source_vault_id'")
            __props__.__dict__["replication_source_vault_id"] = replication_source_vault_id
            if vault_name is None and not opts.urn:
                raise TypeError("Missing required property 'vault_name'")
            __props__.__dict__["vault_name"] = vault_name
            __props__.__dict__["vault_storage_class"] = vault_storage_class
            __props__.__dict__["region_id"] = None
            __props__.__dict__["status"] = None
        super(ReplicationVault, __self__).__init__(
            'alicloud:hbr/replicationVault:ReplicationVault',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[_builtins.str]] = None,
            encrypt_type: Optional[pulumi.Input[_builtins.str]] = None,
            kms_key_id: Optional[pulumi.Input[_builtins.str]] = None,
            region_id: Optional[pulumi.Input[_builtins.str]] = None,
            replication_source_region_id: Optional[pulumi.Input[_builtins.str]] = None,
            replication_source_vault_id: Optional[pulumi.Input[_builtins.str]] = None,
            status: Optional[pulumi.Input[_builtins.str]] = None,
            vault_name: Optional[pulumi.Input[_builtins.str]] = None,
            vault_storage_class: Optional[pulumi.Input[_builtins.str]] = None) -> 'ReplicationVault':
        """
        Get an existing ReplicationVault resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] description: The description of the backup vault.
        :param pulumi.Input[_builtins.str] encrypt_type: The encryption type of the backup vault.
        :param pulumi.Input[_builtins.str] kms_key_id: Alibaba Cloud KMS custom Key or Alias. This parameter is required only when EncryptType = KMS.
        :param pulumi.Input[_builtins.str] region_id: RegionId
        :param pulumi.Input[_builtins.str] replication_source_region_id: The region ID of the source backup vault.
        :param pulumi.Input[_builtins.str] replication_source_vault_id: The vault ID of the source backup vault.
        :param pulumi.Input[_builtins.str] status: The status of the mirror backup vault.
        :param pulumi.Input[_builtins.str] vault_name: The name of the backup vault.
        :param pulumi.Input[_builtins.str] vault_storage_class: Backup Vault Storage Class
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ReplicationVaultState.__new__(_ReplicationVaultState)

        __props__.__dict__["description"] = description
        __props__.__dict__["encrypt_type"] = encrypt_type
        __props__.__dict__["kms_key_id"] = kms_key_id
        __props__.__dict__["region_id"] = region_id
        __props__.__dict__["replication_source_region_id"] = replication_source_region_id
        __props__.__dict__["replication_source_vault_id"] = replication_source_vault_id
        __props__.__dict__["status"] = status
        __props__.__dict__["vault_name"] = vault_name
        __props__.__dict__["vault_storage_class"] = vault_storage_class
        return ReplicationVault(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The description of the backup vault.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter(name="encryptType")
    def encrypt_type(self) -> pulumi.Output[_builtins.str]:
        """
        The encryption type of the backup vault.
        """
        return pulumi.get(self, "encrypt_type")

    @_builtins.property
    @pulumi.getter(name="kmsKeyId")
    def kms_key_id(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Alibaba Cloud KMS custom Key or Alias. This parameter is required only when EncryptType = KMS.
        """
        return pulumi.get(self, "kms_key_id")

    @_builtins.property
    @pulumi.getter(name="regionId")
    def region_id(self) -> pulumi.Output[_builtins.str]:
        """
        RegionId
        """
        return pulumi.get(self, "region_id")

    @_builtins.property
    @pulumi.getter(name="replicationSourceRegionId")
    def replication_source_region_id(self) -> pulumi.Output[_builtins.str]:
        """
        The region ID of the source backup vault.
        """
        return pulumi.get(self, "replication_source_region_id")

    @_builtins.property
    @pulumi.getter(name="replicationSourceVaultId")
    def replication_source_vault_id(self) -> pulumi.Output[_builtins.str]:
        """
        The vault ID of the source backup vault.
        """
        return pulumi.get(self, "replication_source_vault_id")

    @_builtins.property
    @pulumi.getter
    def status(self) -> pulumi.Output[_builtins.str]:
        """
        The status of the mirror backup vault.
        """
        return pulumi.get(self, "status")

    @_builtins.property
    @pulumi.getter(name="vaultName")
    def vault_name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the backup vault.
        """
        return pulumi.get(self, "vault_name")

    @_builtins.property
    @pulumi.getter(name="vaultStorageClass")
    def vault_storage_class(self) -> pulumi.Output[_builtins.str]:
        """
        Backup Vault Storage Class
        """
        return pulumi.get(self, "vault_storage_class")

