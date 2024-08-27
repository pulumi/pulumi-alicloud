# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['BizTypeArgs', 'BizType']

@pulumi.input_type
class BizTypeArgs:
    def __init__(__self__, *,
                 biz_type_name: pulumi.Input[str],
                 biz_type_import: Optional[pulumi.Input[str]] = None,
                 cite_template: Optional[pulumi.Input[bool]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 industry_info: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a BizType resource.
        :param pulumi.Input[str] biz_type_name: The name of the business scenario defined by the customer. It can contain no more than 32 characters in English, numbers, and underscores.
        :param pulumi.Input[str] biz_type_import: The name of the existing business scenario that was imported from when the business scenario was created.
        :param pulumi.Input[bool] cite_template: Specifies whether to import the configuration of an industry template. Default value: false. Valid values: true: imports the configuration of an industry template. false: does not import the configuration of an industry template. If the value is true, you must specify the industryInfo parameter.
        :param pulumi.Input[str] description: The description of the business scenario defined by the customer, which is a combination of Chinese and English, numbers, and underscores, and cannot exceed 32 characters.
        :param pulumi.Input[str] industry_info: The industry classification. Valid values: Social-Registration information-Profile picture Social-Registration information-Nickname Social-Registration information-Bio Social-Instant messaging-Chat Social-Instant messaging-Group chat Social-Instant messaging-Chat room Social-Forums&Communities-Post Social-Forums&Communities-Comment Social-Forums&Communities-Tag Social-Forums&Communities-Recommendation Multimedia-Registration information-Profile picture Multimedia-Registration information-Nickname Multimedia-Registration information-Bio Multimedia-Instant messaging-Chat Multimedia-Live streaming-Heading Multimedia-Live streaming-Cover Multimedia-Live streaming-Content Multimedia-Live streaming-Comment Multimedia-Online storage-Storage content Multimedia-Online storage-Shared content Gaming-Registration information-Nickname Gaming-Registration information-Profile picture Gaming-Registration information-Signature Gaming-Instant messaging-Chat Gaming-Instant messaging-Group chat Gaming-Instant messaging-Chat room Gaming-Forums&Communities-Post Gaming-Forums&Communities-Comment Gaming-Forums&Communities-Tag Gaming-Forums&Communities-Recommendation New retail-Goods-Heading New retail-Goods-Description Reading-Books-Title Reading-Books-Heading Reading-Books-Cover Reading-Books-Content Media-News content-News content Education-Registration information-Nickname Education-Registration information-Profile picture Education-Registration information-Bio Gaming-Instant messaging-Chat Gaming-Forums&Communities-Post Education-Forums&Communities-Comment Education-Forums&Communities-Tag Education-Forums&Communities-Recommendation Education-Customer service-Voice call Others
        """
        pulumi.set(__self__, "biz_type_name", biz_type_name)
        if biz_type_import is not None:
            pulumi.set(__self__, "biz_type_import", biz_type_import)
        if cite_template is not None:
            pulumi.set(__self__, "cite_template", cite_template)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if industry_info is not None:
            pulumi.set(__self__, "industry_info", industry_info)

    @property
    @pulumi.getter(name="bizTypeName")
    def biz_type_name(self) -> pulumi.Input[str]:
        """
        The name of the business scenario defined by the customer. It can contain no more than 32 characters in English, numbers, and underscores.
        """
        return pulumi.get(self, "biz_type_name")

    @biz_type_name.setter
    def biz_type_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "biz_type_name", value)

    @property
    @pulumi.getter(name="bizTypeImport")
    def biz_type_import(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the existing business scenario that was imported from when the business scenario was created.
        """
        return pulumi.get(self, "biz_type_import")

    @biz_type_import.setter
    def biz_type_import(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "biz_type_import", value)

    @property
    @pulumi.getter(name="citeTemplate")
    def cite_template(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether to import the configuration of an industry template. Default value: false. Valid values: true: imports the configuration of an industry template. false: does not import the configuration of an industry template. If the value is true, you must specify the industryInfo parameter.
        """
        return pulumi.get(self, "cite_template")

    @cite_template.setter
    def cite_template(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "cite_template", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the business scenario defined by the customer, which is a combination of Chinese and English, numbers, and underscores, and cannot exceed 32 characters.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="industryInfo")
    def industry_info(self) -> Optional[pulumi.Input[str]]:
        """
        The industry classification. Valid values: Social-Registration information-Profile picture Social-Registration information-Nickname Social-Registration information-Bio Social-Instant messaging-Chat Social-Instant messaging-Group chat Social-Instant messaging-Chat room Social-Forums&Communities-Post Social-Forums&Communities-Comment Social-Forums&Communities-Tag Social-Forums&Communities-Recommendation Multimedia-Registration information-Profile picture Multimedia-Registration information-Nickname Multimedia-Registration information-Bio Multimedia-Instant messaging-Chat Multimedia-Live streaming-Heading Multimedia-Live streaming-Cover Multimedia-Live streaming-Content Multimedia-Live streaming-Comment Multimedia-Online storage-Storage content Multimedia-Online storage-Shared content Gaming-Registration information-Nickname Gaming-Registration information-Profile picture Gaming-Registration information-Signature Gaming-Instant messaging-Chat Gaming-Instant messaging-Group chat Gaming-Instant messaging-Chat room Gaming-Forums&Communities-Post Gaming-Forums&Communities-Comment Gaming-Forums&Communities-Tag Gaming-Forums&Communities-Recommendation New retail-Goods-Heading New retail-Goods-Description Reading-Books-Title Reading-Books-Heading Reading-Books-Cover Reading-Books-Content Media-News content-News content Education-Registration information-Nickname Education-Registration information-Profile picture Education-Registration information-Bio Gaming-Instant messaging-Chat Gaming-Forums&Communities-Post Education-Forums&Communities-Comment Education-Forums&Communities-Tag Education-Forums&Communities-Recommendation Education-Customer service-Voice call Others
        """
        return pulumi.get(self, "industry_info")

    @industry_info.setter
    def industry_info(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "industry_info", value)


@pulumi.input_type
class _BizTypeState:
    def __init__(__self__, *,
                 biz_type_import: Optional[pulumi.Input[str]] = None,
                 biz_type_name: Optional[pulumi.Input[str]] = None,
                 cite_template: Optional[pulumi.Input[bool]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 industry_info: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering BizType resources.
        :param pulumi.Input[str] biz_type_import: The name of the existing business scenario that was imported from when the business scenario was created.
        :param pulumi.Input[str] biz_type_name: The name of the business scenario defined by the customer. It can contain no more than 32 characters in English, numbers, and underscores.
        :param pulumi.Input[bool] cite_template: Specifies whether to import the configuration of an industry template. Default value: false. Valid values: true: imports the configuration of an industry template. false: does not import the configuration of an industry template. If the value is true, you must specify the industryInfo parameter.
        :param pulumi.Input[str] description: The description of the business scenario defined by the customer, which is a combination of Chinese and English, numbers, and underscores, and cannot exceed 32 characters.
        :param pulumi.Input[str] industry_info: The industry classification. Valid values: Social-Registration information-Profile picture Social-Registration information-Nickname Social-Registration information-Bio Social-Instant messaging-Chat Social-Instant messaging-Group chat Social-Instant messaging-Chat room Social-Forums&Communities-Post Social-Forums&Communities-Comment Social-Forums&Communities-Tag Social-Forums&Communities-Recommendation Multimedia-Registration information-Profile picture Multimedia-Registration information-Nickname Multimedia-Registration information-Bio Multimedia-Instant messaging-Chat Multimedia-Live streaming-Heading Multimedia-Live streaming-Cover Multimedia-Live streaming-Content Multimedia-Live streaming-Comment Multimedia-Online storage-Storage content Multimedia-Online storage-Shared content Gaming-Registration information-Nickname Gaming-Registration information-Profile picture Gaming-Registration information-Signature Gaming-Instant messaging-Chat Gaming-Instant messaging-Group chat Gaming-Instant messaging-Chat room Gaming-Forums&Communities-Post Gaming-Forums&Communities-Comment Gaming-Forums&Communities-Tag Gaming-Forums&Communities-Recommendation New retail-Goods-Heading New retail-Goods-Description Reading-Books-Title Reading-Books-Heading Reading-Books-Cover Reading-Books-Content Media-News content-News content Education-Registration information-Nickname Education-Registration information-Profile picture Education-Registration information-Bio Gaming-Instant messaging-Chat Gaming-Forums&Communities-Post Education-Forums&Communities-Comment Education-Forums&Communities-Tag Education-Forums&Communities-Recommendation Education-Customer service-Voice call Others
        """
        if biz_type_import is not None:
            pulumi.set(__self__, "biz_type_import", biz_type_import)
        if biz_type_name is not None:
            pulumi.set(__self__, "biz_type_name", biz_type_name)
        if cite_template is not None:
            pulumi.set(__self__, "cite_template", cite_template)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if industry_info is not None:
            pulumi.set(__self__, "industry_info", industry_info)

    @property
    @pulumi.getter(name="bizTypeImport")
    def biz_type_import(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the existing business scenario that was imported from when the business scenario was created.
        """
        return pulumi.get(self, "biz_type_import")

    @biz_type_import.setter
    def biz_type_import(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "biz_type_import", value)

    @property
    @pulumi.getter(name="bizTypeName")
    def biz_type_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the business scenario defined by the customer. It can contain no more than 32 characters in English, numbers, and underscores.
        """
        return pulumi.get(self, "biz_type_name")

    @biz_type_name.setter
    def biz_type_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "biz_type_name", value)

    @property
    @pulumi.getter(name="citeTemplate")
    def cite_template(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether to import the configuration of an industry template. Default value: false. Valid values: true: imports the configuration of an industry template. false: does not import the configuration of an industry template. If the value is true, you must specify the industryInfo parameter.
        """
        return pulumi.get(self, "cite_template")

    @cite_template.setter
    def cite_template(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "cite_template", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the business scenario defined by the customer, which is a combination of Chinese and English, numbers, and underscores, and cannot exceed 32 characters.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="industryInfo")
    def industry_info(self) -> Optional[pulumi.Input[str]]:
        """
        The industry classification. Valid values: Social-Registration information-Profile picture Social-Registration information-Nickname Social-Registration information-Bio Social-Instant messaging-Chat Social-Instant messaging-Group chat Social-Instant messaging-Chat room Social-Forums&Communities-Post Social-Forums&Communities-Comment Social-Forums&Communities-Tag Social-Forums&Communities-Recommendation Multimedia-Registration information-Profile picture Multimedia-Registration information-Nickname Multimedia-Registration information-Bio Multimedia-Instant messaging-Chat Multimedia-Live streaming-Heading Multimedia-Live streaming-Cover Multimedia-Live streaming-Content Multimedia-Live streaming-Comment Multimedia-Online storage-Storage content Multimedia-Online storage-Shared content Gaming-Registration information-Nickname Gaming-Registration information-Profile picture Gaming-Registration information-Signature Gaming-Instant messaging-Chat Gaming-Instant messaging-Group chat Gaming-Instant messaging-Chat room Gaming-Forums&Communities-Post Gaming-Forums&Communities-Comment Gaming-Forums&Communities-Tag Gaming-Forums&Communities-Recommendation New retail-Goods-Heading New retail-Goods-Description Reading-Books-Title Reading-Books-Heading Reading-Books-Cover Reading-Books-Content Media-News content-News content Education-Registration information-Nickname Education-Registration information-Profile picture Education-Registration information-Bio Gaming-Instant messaging-Chat Gaming-Forums&Communities-Post Education-Forums&Communities-Comment Education-Forums&Communities-Tag Education-Forums&Communities-Recommendation Education-Customer service-Voice call Others
        """
        return pulumi.get(self, "industry_info")

    @industry_info.setter
    def industry_info(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "industry_info", value)


class BizType(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 biz_type_import: Optional[pulumi.Input[str]] = None,
                 biz_type_name: Optional[pulumi.Input[str]] = None,
                 cite_template: Optional[pulumi.Input[bool]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 industry_info: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Aligreen Biz Type resource.

        For information about Aligreen Biz Type and how to use it, see [What is Biz Type](https://www.alibabacloud.com/help/en/).

        > **NOTE:** Available since v1.228.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform_example"
        default = alicloud.aligreen.BizType("default",
            biz_type_name=name,
            description=name,
            cite_template=True,
            industry_info="社交-注册信息-昵称",
            biz_type_import="1")
        ```

        ## Import

        Aligreen Biz Type can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:aligreen/bizType:BizType example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] biz_type_import: The name of the existing business scenario that was imported from when the business scenario was created.
        :param pulumi.Input[str] biz_type_name: The name of the business scenario defined by the customer. It can contain no more than 32 characters in English, numbers, and underscores.
        :param pulumi.Input[bool] cite_template: Specifies whether to import the configuration of an industry template. Default value: false. Valid values: true: imports the configuration of an industry template. false: does not import the configuration of an industry template. If the value is true, you must specify the industryInfo parameter.
        :param pulumi.Input[str] description: The description of the business scenario defined by the customer, which is a combination of Chinese and English, numbers, and underscores, and cannot exceed 32 characters.
        :param pulumi.Input[str] industry_info: The industry classification. Valid values: Social-Registration information-Profile picture Social-Registration information-Nickname Social-Registration information-Bio Social-Instant messaging-Chat Social-Instant messaging-Group chat Social-Instant messaging-Chat room Social-Forums&Communities-Post Social-Forums&Communities-Comment Social-Forums&Communities-Tag Social-Forums&Communities-Recommendation Multimedia-Registration information-Profile picture Multimedia-Registration information-Nickname Multimedia-Registration information-Bio Multimedia-Instant messaging-Chat Multimedia-Live streaming-Heading Multimedia-Live streaming-Cover Multimedia-Live streaming-Content Multimedia-Live streaming-Comment Multimedia-Online storage-Storage content Multimedia-Online storage-Shared content Gaming-Registration information-Nickname Gaming-Registration information-Profile picture Gaming-Registration information-Signature Gaming-Instant messaging-Chat Gaming-Instant messaging-Group chat Gaming-Instant messaging-Chat room Gaming-Forums&Communities-Post Gaming-Forums&Communities-Comment Gaming-Forums&Communities-Tag Gaming-Forums&Communities-Recommendation New retail-Goods-Heading New retail-Goods-Description Reading-Books-Title Reading-Books-Heading Reading-Books-Cover Reading-Books-Content Media-News content-News content Education-Registration information-Nickname Education-Registration information-Profile picture Education-Registration information-Bio Gaming-Instant messaging-Chat Gaming-Forums&Communities-Post Education-Forums&Communities-Comment Education-Forums&Communities-Tag Education-Forums&Communities-Recommendation Education-Customer service-Voice call Others
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: BizTypeArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Aligreen Biz Type resource.

        For information about Aligreen Biz Type and how to use it, see [What is Biz Type](https://www.alibabacloud.com/help/en/).

        > **NOTE:** Available since v1.228.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform_example"
        default = alicloud.aligreen.BizType("default",
            biz_type_name=name,
            description=name,
            cite_template=True,
            industry_info="社交-注册信息-昵称",
            biz_type_import="1")
        ```

        ## Import

        Aligreen Biz Type can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:aligreen/bizType:BizType example <id>
        ```

        :param str resource_name: The name of the resource.
        :param BizTypeArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(BizTypeArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 biz_type_import: Optional[pulumi.Input[str]] = None,
                 biz_type_name: Optional[pulumi.Input[str]] = None,
                 cite_template: Optional[pulumi.Input[bool]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 industry_info: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = BizTypeArgs.__new__(BizTypeArgs)

            __props__.__dict__["biz_type_import"] = biz_type_import
            if biz_type_name is None and not opts.urn:
                raise TypeError("Missing required property 'biz_type_name'")
            __props__.__dict__["biz_type_name"] = biz_type_name
            __props__.__dict__["cite_template"] = cite_template
            __props__.__dict__["description"] = description
            __props__.__dict__["industry_info"] = industry_info
        super(BizType, __self__).__init__(
            'alicloud:aligreen/bizType:BizType',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            biz_type_import: Optional[pulumi.Input[str]] = None,
            biz_type_name: Optional[pulumi.Input[str]] = None,
            cite_template: Optional[pulumi.Input[bool]] = None,
            description: Optional[pulumi.Input[str]] = None,
            industry_info: Optional[pulumi.Input[str]] = None) -> 'BizType':
        """
        Get an existing BizType resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] biz_type_import: The name of the existing business scenario that was imported from when the business scenario was created.
        :param pulumi.Input[str] biz_type_name: The name of the business scenario defined by the customer. It can contain no more than 32 characters in English, numbers, and underscores.
        :param pulumi.Input[bool] cite_template: Specifies whether to import the configuration of an industry template. Default value: false. Valid values: true: imports the configuration of an industry template. false: does not import the configuration of an industry template. If the value is true, you must specify the industryInfo parameter.
        :param pulumi.Input[str] description: The description of the business scenario defined by the customer, which is a combination of Chinese and English, numbers, and underscores, and cannot exceed 32 characters.
        :param pulumi.Input[str] industry_info: The industry classification. Valid values: Social-Registration information-Profile picture Social-Registration information-Nickname Social-Registration information-Bio Social-Instant messaging-Chat Social-Instant messaging-Group chat Social-Instant messaging-Chat room Social-Forums&Communities-Post Social-Forums&Communities-Comment Social-Forums&Communities-Tag Social-Forums&Communities-Recommendation Multimedia-Registration information-Profile picture Multimedia-Registration information-Nickname Multimedia-Registration information-Bio Multimedia-Instant messaging-Chat Multimedia-Live streaming-Heading Multimedia-Live streaming-Cover Multimedia-Live streaming-Content Multimedia-Live streaming-Comment Multimedia-Online storage-Storage content Multimedia-Online storage-Shared content Gaming-Registration information-Nickname Gaming-Registration information-Profile picture Gaming-Registration information-Signature Gaming-Instant messaging-Chat Gaming-Instant messaging-Group chat Gaming-Instant messaging-Chat room Gaming-Forums&Communities-Post Gaming-Forums&Communities-Comment Gaming-Forums&Communities-Tag Gaming-Forums&Communities-Recommendation New retail-Goods-Heading New retail-Goods-Description Reading-Books-Title Reading-Books-Heading Reading-Books-Cover Reading-Books-Content Media-News content-News content Education-Registration information-Nickname Education-Registration information-Profile picture Education-Registration information-Bio Gaming-Instant messaging-Chat Gaming-Forums&Communities-Post Education-Forums&Communities-Comment Education-Forums&Communities-Tag Education-Forums&Communities-Recommendation Education-Customer service-Voice call Others
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _BizTypeState.__new__(_BizTypeState)

        __props__.__dict__["biz_type_import"] = biz_type_import
        __props__.__dict__["biz_type_name"] = biz_type_name
        __props__.__dict__["cite_template"] = cite_template
        __props__.__dict__["description"] = description
        __props__.__dict__["industry_info"] = industry_info
        return BizType(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="bizTypeImport")
    def biz_type_import(self) -> pulumi.Output[Optional[str]]:
        """
        The name of the existing business scenario that was imported from when the business scenario was created.
        """
        return pulumi.get(self, "biz_type_import")

    @property
    @pulumi.getter(name="bizTypeName")
    def biz_type_name(self) -> pulumi.Output[str]:
        """
        The name of the business scenario defined by the customer. It can contain no more than 32 characters in English, numbers, and underscores.
        """
        return pulumi.get(self, "biz_type_name")

    @property
    @pulumi.getter(name="citeTemplate")
    def cite_template(self) -> pulumi.Output[Optional[bool]]:
        """
        Specifies whether to import the configuration of an industry template. Default value: false. Valid values: true: imports the configuration of an industry template. false: does not import the configuration of an industry template. If the value is true, you must specify the industryInfo parameter.
        """
        return pulumi.get(self, "cite_template")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The description of the business scenario defined by the customer, which is a combination of Chinese and English, numbers, and underscores, and cannot exceed 32 characters.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="industryInfo")
    def industry_info(self) -> pulumi.Output[Optional[str]]:
        """
        The industry classification. Valid values: Social-Registration information-Profile picture Social-Registration information-Nickname Social-Registration information-Bio Social-Instant messaging-Chat Social-Instant messaging-Group chat Social-Instant messaging-Chat room Social-Forums&Communities-Post Social-Forums&Communities-Comment Social-Forums&Communities-Tag Social-Forums&Communities-Recommendation Multimedia-Registration information-Profile picture Multimedia-Registration information-Nickname Multimedia-Registration information-Bio Multimedia-Instant messaging-Chat Multimedia-Live streaming-Heading Multimedia-Live streaming-Cover Multimedia-Live streaming-Content Multimedia-Live streaming-Comment Multimedia-Online storage-Storage content Multimedia-Online storage-Shared content Gaming-Registration information-Nickname Gaming-Registration information-Profile picture Gaming-Registration information-Signature Gaming-Instant messaging-Chat Gaming-Instant messaging-Group chat Gaming-Instant messaging-Chat room Gaming-Forums&Communities-Post Gaming-Forums&Communities-Comment Gaming-Forums&Communities-Tag Gaming-Forums&Communities-Recommendation New retail-Goods-Heading New retail-Goods-Description Reading-Books-Title Reading-Books-Heading Reading-Books-Cover Reading-Books-Content Media-News content-News content Education-Registration information-Nickname Education-Registration information-Profile picture Education-Registration information-Bio Gaming-Instant messaging-Chat Gaming-Forums&Communities-Post Education-Forums&Communities-Comment Education-Forums&Communities-Tag Education-Forums&Communities-Recommendation Education-Customer service-Voice call Others
        """
        return pulumi.get(self, "industry_info")
