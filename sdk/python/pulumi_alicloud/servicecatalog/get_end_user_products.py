# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs

__all__ = [
    'GetEndUserProductsResult',
    'AwaitableGetEndUserProductsResult',
    'get_end_user_products',
    'get_end_user_products_output',
]

@pulumi.output_type
class GetEndUserProductsResult:
    """
    A collection of values returned by getEndUserProducts.
    """
    def __init__(__self__, end_user_products=None, id=None, ids=None, name_regex=None, output_file=None, page_number=None, page_size=None, sort_by=None, sort_order=None):
        if end_user_products and not isinstance(end_user_products, list):
            raise TypeError("Expected argument 'end_user_products' to be a list")
        pulumi.set(__self__, "end_user_products", end_user_products)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if name_regex and not isinstance(name_regex, str):
            raise TypeError("Expected argument 'name_regex' to be a str")
        pulumi.set(__self__, "name_regex", name_regex)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if page_number and not isinstance(page_number, int):
            raise TypeError("Expected argument 'page_number' to be a int")
        pulumi.set(__self__, "page_number", page_number)
        if page_size and not isinstance(page_size, int):
            raise TypeError("Expected argument 'page_size' to be a int")
        pulumi.set(__self__, "page_size", page_size)
        if sort_by and not isinstance(sort_by, str):
            raise TypeError("Expected argument 'sort_by' to be a str")
        pulumi.set(__self__, "sort_by", sort_by)
        if sort_order and not isinstance(sort_order, str):
            raise TypeError("Expected argument 'sort_order' to be a str")
        pulumi.set(__self__, "sort_order", sort_order)

    @property
    @pulumi.getter(name="endUserProducts")
    def end_user_products(self) -> Sequence['outputs.GetEndUserProductsEndUserProductResult']:
        """
        A list of End User Product Entries. Each element contains the following attributes:
        """
        return pulumi.get(self, "end_user_products")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def ids(self) -> Sequence[str]:
        """
        A list of End User Product IDs.
        """
        return pulumi.get(self, "ids")

    @property
    @pulumi.getter(name="nameRegex")
    def name_regex(self) -> Optional[str]:
        return pulumi.get(self, "name_regex")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter(name="pageNumber")
    def page_number(self) -> Optional[int]:
        return pulumi.get(self, "page_number")

    @property
    @pulumi.getter(name="pageSize")
    def page_size(self) -> Optional[int]:
        return pulumi.get(self, "page_size")

    @property
    @pulumi.getter(name="sortBy")
    def sort_by(self) -> Optional[str]:
        return pulumi.get(self, "sort_by")

    @property
    @pulumi.getter(name="sortOrder")
    def sort_order(self) -> Optional[str]:
        return pulumi.get(self, "sort_order")


class AwaitableGetEndUserProductsResult(GetEndUserProductsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetEndUserProductsResult(
            end_user_products=self.end_user_products,
            id=self.id,
            ids=self.ids,
            name_regex=self.name_regex,
            output_file=self.output_file,
            page_number=self.page_number,
            page_size=self.page_size,
            sort_by=self.sort_by,
            sort_order=self.sort_order)


def get_end_user_products(ids: Optional[Sequence[str]] = None,
                          name_regex: Optional[str] = None,
                          output_file: Optional[str] = None,
                          page_number: Optional[int] = None,
                          page_size: Optional[int] = None,
                          sort_by: Optional[str] = None,
                          sort_order: Optional[str] = None,
                          opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetEndUserProductsResult:
    """
    This data source provides Service Catalog End User Product available to the user.[What is End User Product](https://www.alibabacloud.com/help/en/servicecatalog/latest/api-doc-servicecatalog-2021-09-01-api-doc-listproductsasenduser)

    > **NOTE:** Available in 1.197.0+

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    default = alicloud.servicecatalog.get_end_user_products(name_regex="ram模板创建")
    pulumi.export("alicloudServiceCatalogEndUserProductExampleId", default.end_user_products[0].id)
    ```


    :param Sequence[str] ids: A list of End User Product IDs.
    :param str name_regex: A regex string to filter results by product name.
    :param str sort_by: The field that is used to sort the queried data. The value is fixed as CreateTime, which specifies the creation time of products.
    :param str sort_order: The order in which you want to sort the queried data. Valid values: `Asc`, `Desc`.
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['pageNumber'] = page_number
    __args__['pageSize'] = page_size
    __args__['sortBy'] = sort_by
    __args__['sortOrder'] = sort_order
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:servicecatalog/getEndUserProducts:getEndUserProducts', __args__, opts=opts, typ=GetEndUserProductsResult).value

    return AwaitableGetEndUserProductsResult(
        end_user_products=__ret__.end_user_products,
        id=__ret__.id,
        ids=__ret__.ids,
        name_regex=__ret__.name_regex,
        output_file=__ret__.output_file,
        page_number=__ret__.page_number,
        page_size=__ret__.page_size,
        sort_by=__ret__.sort_by,
        sort_order=__ret__.sort_order)


@_utilities.lift_output_func(get_end_user_products)
def get_end_user_products_output(ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                                 name_regex: Optional[pulumi.Input[Optional[str]]] = None,
                                 output_file: Optional[pulumi.Input[Optional[str]]] = None,
                                 page_number: Optional[pulumi.Input[Optional[int]]] = None,
                                 page_size: Optional[pulumi.Input[Optional[int]]] = None,
                                 sort_by: Optional[pulumi.Input[Optional[str]]] = None,
                                 sort_order: Optional[pulumi.Input[Optional[str]]] = None,
                                 opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetEndUserProductsResult]:
    """
    This data source provides Service Catalog End User Product available to the user.[What is End User Product](https://www.alibabacloud.com/help/en/servicecatalog/latest/api-doc-servicecatalog-2021-09-01-api-doc-listproductsasenduser)

    > **NOTE:** Available in 1.197.0+

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    default = alicloud.servicecatalog.get_end_user_products(name_regex="ram模板创建")
    pulumi.export("alicloudServiceCatalogEndUserProductExampleId", default.end_user_products[0].id)
    ```


    :param Sequence[str] ids: A list of End User Product IDs.
    :param str name_regex: A regex string to filter results by product name.
    :param str sort_by: The field that is used to sort the queried data. The value is fixed as CreateTime, which specifies the creation time of products.
    :param str sort_order: The order in which you want to sort the queried data. Valid values: `Asc`, `Desc`.
    """
    ...