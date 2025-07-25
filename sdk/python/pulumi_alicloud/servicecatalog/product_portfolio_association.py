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

__all__ = ['ProductPortfolioAssociationArgs', 'ProductPortfolioAssociation']

@pulumi.input_type
class ProductPortfolioAssociationArgs:
    def __init__(__self__, *,
                 portfolio_id: pulumi.Input[_builtins.str],
                 product_id: pulumi.Input[_builtins.str]):
        """
        The set of arguments for constructing a ProductPortfolioAssociation resource.
        :param pulumi.Input[_builtins.str] portfolio_id: Product Portfolio ID
        :param pulumi.Input[_builtins.str] product_id: Product ID
        """
        pulumi.set(__self__, "portfolio_id", portfolio_id)
        pulumi.set(__self__, "product_id", product_id)

    @_builtins.property
    @pulumi.getter(name="portfolioId")
    def portfolio_id(self) -> pulumi.Input[_builtins.str]:
        """
        Product Portfolio ID
        """
        return pulumi.get(self, "portfolio_id")

    @portfolio_id.setter
    def portfolio_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "portfolio_id", value)

    @_builtins.property
    @pulumi.getter(name="productId")
    def product_id(self) -> pulumi.Input[_builtins.str]:
        """
        Product ID
        """
        return pulumi.get(self, "product_id")

    @product_id.setter
    def product_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "product_id", value)


@pulumi.input_type
class _ProductPortfolioAssociationState:
    def __init__(__self__, *,
                 portfolio_id: Optional[pulumi.Input[_builtins.str]] = None,
                 product_id: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering ProductPortfolioAssociation resources.
        :param pulumi.Input[_builtins.str] portfolio_id: Product Portfolio ID
        :param pulumi.Input[_builtins.str] product_id: Product ID
        """
        if portfolio_id is not None:
            pulumi.set(__self__, "portfolio_id", portfolio_id)
        if product_id is not None:
            pulumi.set(__self__, "product_id", product_id)

    @_builtins.property
    @pulumi.getter(name="portfolioId")
    def portfolio_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Product Portfolio ID
        """
        return pulumi.get(self, "portfolio_id")

    @portfolio_id.setter
    def portfolio_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "portfolio_id", value)

    @_builtins.property
    @pulumi.getter(name="productId")
    def product_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Product ID
        """
        return pulumi.get(self, "product_id")

    @product_id.setter
    def product_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "product_id", value)


@pulumi.type_token("alicloud:servicecatalog/productPortfolioAssociation:ProductPortfolioAssociation")
class ProductPortfolioAssociation(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 portfolio_id: Optional[pulumi.Input[_builtins.str]] = None,
                 product_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Provides a Service Catalog Product Portfolio Association resource.

        Product portfolio association.

        For information about Service Catalog Product Portfolio Association and how to use it, see [What is Product Portfolio Association](https://www.alibabacloud.com/help/en/service-catalog/developer-reference/api-servicecatalog-2021-09-01-associateproductwithportfolio).

        > **NOTE:** Available since v1.230.0.

        ## Import

        Service Catalog Product Portfolio Association can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:servicecatalog/productPortfolioAssociation:ProductPortfolioAssociation example <product_id>:<portfolio_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] portfolio_id: Product Portfolio ID
        :param pulumi.Input[_builtins.str] product_id: Product ID
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ProductPortfolioAssociationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Service Catalog Product Portfolio Association resource.

        Product portfolio association.

        For information about Service Catalog Product Portfolio Association and how to use it, see [What is Product Portfolio Association](https://www.alibabacloud.com/help/en/service-catalog/developer-reference/api-servicecatalog-2021-09-01-associateproductwithportfolio).

        > **NOTE:** Available since v1.230.0.

        ## Import

        Service Catalog Product Portfolio Association can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:servicecatalog/productPortfolioAssociation:ProductPortfolioAssociation example <product_id>:<portfolio_id>
        ```

        :param str resource_name: The name of the resource.
        :param ProductPortfolioAssociationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ProductPortfolioAssociationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 portfolio_id: Optional[pulumi.Input[_builtins.str]] = None,
                 product_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ProductPortfolioAssociationArgs.__new__(ProductPortfolioAssociationArgs)

            if portfolio_id is None and not opts.urn:
                raise TypeError("Missing required property 'portfolio_id'")
            __props__.__dict__["portfolio_id"] = portfolio_id
            if product_id is None and not opts.urn:
                raise TypeError("Missing required property 'product_id'")
            __props__.__dict__["product_id"] = product_id
        super(ProductPortfolioAssociation, __self__).__init__(
            'alicloud:servicecatalog/productPortfolioAssociation:ProductPortfolioAssociation',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            portfolio_id: Optional[pulumi.Input[_builtins.str]] = None,
            product_id: Optional[pulumi.Input[_builtins.str]] = None) -> 'ProductPortfolioAssociation':
        """
        Get an existing ProductPortfolioAssociation resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] portfolio_id: Product Portfolio ID
        :param pulumi.Input[_builtins.str] product_id: Product ID
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ProductPortfolioAssociationState.__new__(_ProductPortfolioAssociationState)

        __props__.__dict__["portfolio_id"] = portfolio_id
        __props__.__dict__["product_id"] = product_id
        return ProductPortfolioAssociation(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="portfolioId")
    def portfolio_id(self) -> pulumi.Output[_builtins.str]:
        """
        Product Portfolio ID
        """
        return pulumi.get(self, "portfolio_id")

    @_builtins.property
    @pulumi.getter(name="productId")
    def product_id(self) -> pulumi.Output[_builtins.str]:
        """
        Product ID
        """
        return pulumi.get(self, "product_id")

