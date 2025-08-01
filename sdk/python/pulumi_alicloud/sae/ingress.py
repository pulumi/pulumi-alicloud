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
from . import outputs
from ._inputs import *

__all__ = ['IngressArgs', 'Ingress']

@pulumi.input_type
class IngressArgs:
    def __init__(__self__, *,
                 listener_port: pulumi.Input[_builtins.int],
                 namespace_id: pulumi.Input[_builtins.str],
                 rules: pulumi.Input[Sequence[pulumi.Input['IngressRuleArgs']]],
                 slb_id: pulumi.Input[_builtins.str],
                 cert_id: Optional[pulumi.Input[_builtins.str]] = None,
                 cert_ids: Optional[pulumi.Input[_builtins.str]] = None,
                 default_rule: Optional[pulumi.Input['IngressDefaultRuleArgs']] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 listener_protocol: Optional[pulumi.Input[_builtins.str]] = None,
                 load_balance_type: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a Ingress resource.
        :param pulumi.Input[_builtins.int] listener_port: SLB listening port.
        :param pulumi.Input[_builtins.str] namespace_id: The ID of Namespace. It can contain 2 to 32 lowercase characters.The value is in format `{RegionId}:{namespace}`.
        :param pulumi.Input[Sequence[pulumi.Input['IngressRuleArgs']]] rules: Forwarding rules. Forward traffic to the specified application according to the domain name and path. See `rules` below.
        :param pulumi.Input[_builtins.str] slb_id: SLB ID.
        :param pulumi.Input[_builtins.str] cert_id: The certificate ID of the HTTPS listener. The `cert_id` takes effect only when `load_balance_type` is set to `clb`.
        :param pulumi.Input[_builtins.str] cert_ids: The certificate IDs of the HTTPS listener, and multiple certificate IDs are separated by commas. The `cert_ids` takes effect only when `load_balance_type` is set to `alb`.
        :param pulumi.Input['IngressDefaultRuleArgs'] default_rule: Default Rule. See `default_rule` below.
        :param pulumi.Input[_builtins.str] description: Description.
        :param pulumi.Input[_builtins.str] listener_protocol: The protocol that is used to forward requests. Default value: `HTTP`. Valid values: `HTTP`, `HTTPS`.
        :param pulumi.Input[_builtins.str] load_balance_type: The type of the SLB instance. Default value: `clb`. Valid values: `clb`, `alb`.
        """
        pulumi.set(__self__, "listener_port", listener_port)
        pulumi.set(__self__, "namespace_id", namespace_id)
        pulumi.set(__self__, "rules", rules)
        pulumi.set(__self__, "slb_id", slb_id)
        if cert_id is not None:
            pulumi.set(__self__, "cert_id", cert_id)
        if cert_ids is not None:
            pulumi.set(__self__, "cert_ids", cert_ids)
        if default_rule is not None:
            pulumi.set(__self__, "default_rule", default_rule)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if listener_protocol is not None:
            pulumi.set(__self__, "listener_protocol", listener_protocol)
        if load_balance_type is not None:
            pulumi.set(__self__, "load_balance_type", load_balance_type)

    @_builtins.property
    @pulumi.getter(name="listenerPort")
    def listener_port(self) -> pulumi.Input[_builtins.int]:
        """
        SLB listening port.
        """
        return pulumi.get(self, "listener_port")

    @listener_port.setter
    def listener_port(self, value: pulumi.Input[_builtins.int]):
        pulumi.set(self, "listener_port", value)

    @_builtins.property
    @pulumi.getter(name="namespaceId")
    def namespace_id(self) -> pulumi.Input[_builtins.str]:
        """
        The ID of Namespace. It can contain 2 to 32 lowercase characters.The value is in format `{RegionId}:{namespace}`.
        """
        return pulumi.get(self, "namespace_id")

    @namespace_id.setter
    def namespace_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "namespace_id", value)

    @_builtins.property
    @pulumi.getter
    def rules(self) -> pulumi.Input[Sequence[pulumi.Input['IngressRuleArgs']]]:
        """
        Forwarding rules. Forward traffic to the specified application according to the domain name and path. See `rules` below.
        """
        return pulumi.get(self, "rules")

    @rules.setter
    def rules(self, value: pulumi.Input[Sequence[pulumi.Input['IngressRuleArgs']]]):
        pulumi.set(self, "rules", value)

    @_builtins.property
    @pulumi.getter(name="slbId")
    def slb_id(self) -> pulumi.Input[_builtins.str]:
        """
        SLB ID.
        """
        return pulumi.get(self, "slb_id")

    @slb_id.setter
    def slb_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "slb_id", value)

    @_builtins.property
    @pulumi.getter(name="certId")
    def cert_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The certificate ID of the HTTPS listener. The `cert_id` takes effect only when `load_balance_type` is set to `clb`.
        """
        return pulumi.get(self, "cert_id")

    @cert_id.setter
    def cert_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "cert_id", value)

    @_builtins.property
    @pulumi.getter(name="certIds")
    def cert_ids(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The certificate IDs of the HTTPS listener, and multiple certificate IDs are separated by commas. The `cert_ids` takes effect only when `load_balance_type` is set to `alb`.
        """
        return pulumi.get(self, "cert_ids")

    @cert_ids.setter
    def cert_ids(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "cert_ids", value)

    @_builtins.property
    @pulumi.getter(name="defaultRule")
    def default_rule(self) -> Optional[pulumi.Input['IngressDefaultRuleArgs']]:
        """
        Default Rule. See `default_rule` below.
        """
        return pulumi.get(self, "default_rule")

    @default_rule.setter
    def default_rule(self, value: Optional[pulumi.Input['IngressDefaultRuleArgs']]):
        pulumi.set(self, "default_rule", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Description.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter(name="listenerProtocol")
    def listener_protocol(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The protocol that is used to forward requests. Default value: `HTTP`. Valid values: `HTTP`, `HTTPS`.
        """
        return pulumi.get(self, "listener_protocol")

    @listener_protocol.setter
    def listener_protocol(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "listener_protocol", value)

    @_builtins.property
    @pulumi.getter(name="loadBalanceType")
    def load_balance_type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The type of the SLB instance. Default value: `clb`. Valid values: `clb`, `alb`.
        """
        return pulumi.get(self, "load_balance_type")

    @load_balance_type.setter
    def load_balance_type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "load_balance_type", value)


@pulumi.input_type
class _IngressState:
    def __init__(__self__, *,
                 cert_id: Optional[pulumi.Input[_builtins.str]] = None,
                 cert_ids: Optional[pulumi.Input[_builtins.str]] = None,
                 default_rule: Optional[pulumi.Input['IngressDefaultRuleArgs']] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 listener_port: Optional[pulumi.Input[_builtins.int]] = None,
                 listener_protocol: Optional[pulumi.Input[_builtins.str]] = None,
                 load_balance_type: Optional[pulumi.Input[_builtins.str]] = None,
                 namespace_id: Optional[pulumi.Input[_builtins.str]] = None,
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input['IngressRuleArgs']]]] = None,
                 slb_id: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering Ingress resources.
        :param pulumi.Input[_builtins.str] cert_id: The certificate ID of the HTTPS listener. The `cert_id` takes effect only when `load_balance_type` is set to `clb`.
        :param pulumi.Input[_builtins.str] cert_ids: The certificate IDs of the HTTPS listener, and multiple certificate IDs are separated by commas. The `cert_ids` takes effect only when `load_balance_type` is set to `alb`.
        :param pulumi.Input['IngressDefaultRuleArgs'] default_rule: Default Rule. See `default_rule` below.
        :param pulumi.Input[_builtins.str] description: Description.
        :param pulumi.Input[_builtins.int] listener_port: SLB listening port.
        :param pulumi.Input[_builtins.str] listener_protocol: The protocol that is used to forward requests. Default value: `HTTP`. Valid values: `HTTP`, `HTTPS`.
        :param pulumi.Input[_builtins.str] load_balance_type: The type of the SLB instance. Default value: `clb`. Valid values: `clb`, `alb`.
        :param pulumi.Input[_builtins.str] namespace_id: The ID of Namespace. It can contain 2 to 32 lowercase characters.The value is in format `{RegionId}:{namespace}`.
        :param pulumi.Input[Sequence[pulumi.Input['IngressRuleArgs']]] rules: Forwarding rules. Forward traffic to the specified application according to the domain name and path. See `rules` below.
        :param pulumi.Input[_builtins.str] slb_id: SLB ID.
        """
        if cert_id is not None:
            pulumi.set(__self__, "cert_id", cert_id)
        if cert_ids is not None:
            pulumi.set(__self__, "cert_ids", cert_ids)
        if default_rule is not None:
            pulumi.set(__self__, "default_rule", default_rule)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if listener_port is not None:
            pulumi.set(__self__, "listener_port", listener_port)
        if listener_protocol is not None:
            pulumi.set(__self__, "listener_protocol", listener_protocol)
        if load_balance_type is not None:
            pulumi.set(__self__, "load_balance_type", load_balance_type)
        if namespace_id is not None:
            pulumi.set(__self__, "namespace_id", namespace_id)
        if rules is not None:
            pulumi.set(__self__, "rules", rules)
        if slb_id is not None:
            pulumi.set(__self__, "slb_id", slb_id)

    @_builtins.property
    @pulumi.getter(name="certId")
    def cert_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The certificate ID of the HTTPS listener. The `cert_id` takes effect only when `load_balance_type` is set to `clb`.
        """
        return pulumi.get(self, "cert_id")

    @cert_id.setter
    def cert_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "cert_id", value)

    @_builtins.property
    @pulumi.getter(name="certIds")
    def cert_ids(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The certificate IDs of the HTTPS listener, and multiple certificate IDs are separated by commas. The `cert_ids` takes effect only when `load_balance_type` is set to `alb`.
        """
        return pulumi.get(self, "cert_ids")

    @cert_ids.setter
    def cert_ids(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "cert_ids", value)

    @_builtins.property
    @pulumi.getter(name="defaultRule")
    def default_rule(self) -> Optional[pulumi.Input['IngressDefaultRuleArgs']]:
        """
        Default Rule. See `default_rule` below.
        """
        return pulumi.get(self, "default_rule")

    @default_rule.setter
    def default_rule(self, value: Optional[pulumi.Input['IngressDefaultRuleArgs']]):
        pulumi.set(self, "default_rule", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Description.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter(name="listenerPort")
    def listener_port(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        SLB listening port.
        """
        return pulumi.get(self, "listener_port")

    @listener_port.setter
    def listener_port(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "listener_port", value)

    @_builtins.property
    @pulumi.getter(name="listenerProtocol")
    def listener_protocol(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The protocol that is used to forward requests. Default value: `HTTP`. Valid values: `HTTP`, `HTTPS`.
        """
        return pulumi.get(self, "listener_protocol")

    @listener_protocol.setter
    def listener_protocol(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "listener_protocol", value)

    @_builtins.property
    @pulumi.getter(name="loadBalanceType")
    def load_balance_type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The type of the SLB instance. Default value: `clb`. Valid values: `clb`, `alb`.
        """
        return pulumi.get(self, "load_balance_type")

    @load_balance_type.setter
    def load_balance_type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "load_balance_type", value)

    @_builtins.property
    @pulumi.getter(name="namespaceId")
    def namespace_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of Namespace. It can contain 2 to 32 lowercase characters.The value is in format `{RegionId}:{namespace}`.
        """
        return pulumi.get(self, "namespace_id")

    @namespace_id.setter
    def namespace_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "namespace_id", value)

    @_builtins.property
    @pulumi.getter
    def rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['IngressRuleArgs']]]]:
        """
        Forwarding rules. Forward traffic to the specified application according to the domain name and path. See `rules` below.
        """
        return pulumi.get(self, "rules")

    @rules.setter
    def rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['IngressRuleArgs']]]]):
        pulumi.set(self, "rules", value)

    @_builtins.property
    @pulumi.getter(name="slbId")
    def slb_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        SLB ID.
        """
        return pulumi.get(self, "slb_id")

    @slb_id.setter
    def slb_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "slb_id", value)


@pulumi.type_token("alicloud:sae/ingress:Ingress")
class Ingress(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cert_id: Optional[pulumi.Input[_builtins.str]] = None,
                 cert_ids: Optional[pulumi.Input[_builtins.str]] = None,
                 default_rule: Optional[pulumi.Input[Union['IngressDefaultRuleArgs', 'IngressDefaultRuleArgsDict']]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 listener_port: Optional[pulumi.Input[_builtins.int]] = None,
                 listener_protocol: Optional[pulumi.Input[_builtins.str]] = None,
                 load_balance_type: Optional[pulumi.Input[_builtins.str]] = None,
                 namespace_id: Optional[pulumi.Input[_builtins.str]] = None,
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input[Union['IngressRuleArgs', 'IngressRuleArgsDict']]]]] = None,
                 slb_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Provides a Serverless App Engine (SAE) Ingress resource.

        For information about Serverless App Engine (SAE) Ingress and how to use it, see [What is Ingress](https://next.api.aliyun.com/api/sae/2019-05-06/CreateIngress).

        > **NOTE:** Available since v1.137.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud
        import pulumi_random as random

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf-example"
        default = alicloud.get_regions(current=True)
        default_integer = random.index.Integer("default",
            max=99999,
            min=10000)
        default_get_zones = alicloud.get_zones(available_resource_creation="VSwitch")
        default_network = alicloud.vpc.Network("default",
            vpc_name=name,
            cidr_block="10.4.0.0/16")
        default_switch = alicloud.vpc.Switch("default",
            vswitch_name=name,
            cidr_block="10.4.0.0/24",
            vpc_id=default_network.id,
            zone_id=default_get_zones.zones[0].id)
        default_security_group = alicloud.ecs.SecurityGroup("default", vpc_id=default_network.id)
        default_namespace = alicloud.sae.Namespace("default",
            namespace_id=f"{default.regions[0].id}:example{default_integer['result']}",
            namespace_name=name,
            namespace_description=name,
            enable_micro_registration=False)
        default_application = alicloud.sae.Application("default",
            app_description=name,
            app_name=f"{name}-{default_integer['result']}",
            namespace_id=default_namespace.id,
            image_url=f"registry-vpc.{default.regions[0].id}.aliyuncs.com/sae-demo-image/consumer:1.0",
            package_type="Image",
            security_group_id=default_security_group.id,
            vpc_id=default_network.id,
            vswitch_id=default_switch.id,
            timezone="Asia/Beijing",
            replicas=5,
            cpu=500,
            memory=2048)
        default_application_load_balancer = alicloud.slb.ApplicationLoadBalancer("default",
            load_balancer_name=name,
            vswitch_id=default_switch.id,
            load_balancer_spec="slb.s2.small",
            address_type="intranet")
        default_ingress = alicloud.sae.Ingress("default",
            slb_id=default_application_load_balancer.id,
            namespace_id=default_namespace.id,
            listener_port=80,
            rules=[{
                "app_id": default_application.id,
                "container_port": 443,
                "domain": "www.alicloud.com",
                "app_name": default_application.app_name,
                "path": "/",
            }],
            default_rule={
                "app_id": default_application.id,
                "container_port": 443,
            })
        ```

        ## Import

        Serverless App Engine (SAE) Ingress can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:sae/ingress:Ingress example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] cert_id: The certificate ID of the HTTPS listener. The `cert_id` takes effect only when `load_balance_type` is set to `clb`.
        :param pulumi.Input[_builtins.str] cert_ids: The certificate IDs of the HTTPS listener, and multiple certificate IDs are separated by commas. The `cert_ids` takes effect only when `load_balance_type` is set to `alb`.
        :param pulumi.Input[Union['IngressDefaultRuleArgs', 'IngressDefaultRuleArgsDict']] default_rule: Default Rule. See `default_rule` below.
        :param pulumi.Input[_builtins.str] description: Description.
        :param pulumi.Input[_builtins.int] listener_port: SLB listening port.
        :param pulumi.Input[_builtins.str] listener_protocol: The protocol that is used to forward requests. Default value: `HTTP`. Valid values: `HTTP`, `HTTPS`.
        :param pulumi.Input[_builtins.str] load_balance_type: The type of the SLB instance. Default value: `clb`. Valid values: `clb`, `alb`.
        :param pulumi.Input[_builtins.str] namespace_id: The ID of Namespace. It can contain 2 to 32 lowercase characters.The value is in format `{RegionId}:{namespace}`.
        :param pulumi.Input[Sequence[pulumi.Input[Union['IngressRuleArgs', 'IngressRuleArgsDict']]]] rules: Forwarding rules. Forward traffic to the specified application according to the domain name and path. See `rules` below.
        :param pulumi.Input[_builtins.str] slb_id: SLB ID.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: IngressArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Serverless App Engine (SAE) Ingress resource.

        For information about Serverless App Engine (SAE) Ingress and how to use it, see [What is Ingress](https://next.api.aliyun.com/api/sae/2019-05-06/CreateIngress).

        > **NOTE:** Available since v1.137.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud
        import pulumi_random as random

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf-example"
        default = alicloud.get_regions(current=True)
        default_integer = random.index.Integer("default",
            max=99999,
            min=10000)
        default_get_zones = alicloud.get_zones(available_resource_creation="VSwitch")
        default_network = alicloud.vpc.Network("default",
            vpc_name=name,
            cidr_block="10.4.0.0/16")
        default_switch = alicloud.vpc.Switch("default",
            vswitch_name=name,
            cidr_block="10.4.0.0/24",
            vpc_id=default_network.id,
            zone_id=default_get_zones.zones[0].id)
        default_security_group = alicloud.ecs.SecurityGroup("default", vpc_id=default_network.id)
        default_namespace = alicloud.sae.Namespace("default",
            namespace_id=f"{default.regions[0].id}:example{default_integer['result']}",
            namespace_name=name,
            namespace_description=name,
            enable_micro_registration=False)
        default_application = alicloud.sae.Application("default",
            app_description=name,
            app_name=f"{name}-{default_integer['result']}",
            namespace_id=default_namespace.id,
            image_url=f"registry-vpc.{default.regions[0].id}.aliyuncs.com/sae-demo-image/consumer:1.0",
            package_type="Image",
            security_group_id=default_security_group.id,
            vpc_id=default_network.id,
            vswitch_id=default_switch.id,
            timezone="Asia/Beijing",
            replicas=5,
            cpu=500,
            memory=2048)
        default_application_load_balancer = alicloud.slb.ApplicationLoadBalancer("default",
            load_balancer_name=name,
            vswitch_id=default_switch.id,
            load_balancer_spec="slb.s2.small",
            address_type="intranet")
        default_ingress = alicloud.sae.Ingress("default",
            slb_id=default_application_load_balancer.id,
            namespace_id=default_namespace.id,
            listener_port=80,
            rules=[{
                "app_id": default_application.id,
                "container_port": 443,
                "domain": "www.alicloud.com",
                "app_name": default_application.app_name,
                "path": "/",
            }],
            default_rule={
                "app_id": default_application.id,
                "container_port": 443,
            })
        ```

        ## Import

        Serverless App Engine (SAE) Ingress can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:sae/ingress:Ingress example <id>
        ```

        :param str resource_name: The name of the resource.
        :param IngressArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(IngressArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cert_id: Optional[pulumi.Input[_builtins.str]] = None,
                 cert_ids: Optional[pulumi.Input[_builtins.str]] = None,
                 default_rule: Optional[pulumi.Input[Union['IngressDefaultRuleArgs', 'IngressDefaultRuleArgsDict']]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 listener_port: Optional[pulumi.Input[_builtins.int]] = None,
                 listener_protocol: Optional[pulumi.Input[_builtins.str]] = None,
                 load_balance_type: Optional[pulumi.Input[_builtins.str]] = None,
                 namespace_id: Optional[pulumi.Input[_builtins.str]] = None,
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input[Union['IngressRuleArgs', 'IngressRuleArgsDict']]]]] = None,
                 slb_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = IngressArgs.__new__(IngressArgs)

            __props__.__dict__["cert_id"] = cert_id
            __props__.__dict__["cert_ids"] = cert_ids
            __props__.__dict__["default_rule"] = default_rule
            __props__.__dict__["description"] = description
            if listener_port is None and not opts.urn:
                raise TypeError("Missing required property 'listener_port'")
            __props__.__dict__["listener_port"] = listener_port
            __props__.__dict__["listener_protocol"] = listener_protocol
            __props__.__dict__["load_balance_type"] = load_balance_type
            if namespace_id is None and not opts.urn:
                raise TypeError("Missing required property 'namespace_id'")
            __props__.__dict__["namespace_id"] = namespace_id
            if rules is None and not opts.urn:
                raise TypeError("Missing required property 'rules'")
            __props__.__dict__["rules"] = rules
            if slb_id is None and not opts.urn:
                raise TypeError("Missing required property 'slb_id'")
            __props__.__dict__["slb_id"] = slb_id
        super(Ingress, __self__).__init__(
            'alicloud:sae/ingress:Ingress',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            cert_id: Optional[pulumi.Input[_builtins.str]] = None,
            cert_ids: Optional[pulumi.Input[_builtins.str]] = None,
            default_rule: Optional[pulumi.Input[Union['IngressDefaultRuleArgs', 'IngressDefaultRuleArgsDict']]] = None,
            description: Optional[pulumi.Input[_builtins.str]] = None,
            listener_port: Optional[pulumi.Input[_builtins.int]] = None,
            listener_protocol: Optional[pulumi.Input[_builtins.str]] = None,
            load_balance_type: Optional[pulumi.Input[_builtins.str]] = None,
            namespace_id: Optional[pulumi.Input[_builtins.str]] = None,
            rules: Optional[pulumi.Input[Sequence[pulumi.Input[Union['IngressRuleArgs', 'IngressRuleArgsDict']]]]] = None,
            slb_id: Optional[pulumi.Input[_builtins.str]] = None) -> 'Ingress':
        """
        Get an existing Ingress resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] cert_id: The certificate ID of the HTTPS listener. The `cert_id` takes effect only when `load_balance_type` is set to `clb`.
        :param pulumi.Input[_builtins.str] cert_ids: The certificate IDs of the HTTPS listener, and multiple certificate IDs are separated by commas. The `cert_ids` takes effect only when `load_balance_type` is set to `alb`.
        :param pulumi.Input[Union['IngressDefaultRuleArgs', 'IngressDefaultRuleArgsDict']] default_rule: Default Rule. See `default_rule` below.
        :param pulumi.Input[_builtins.str] description: Description.
        :param pulumi.Input[_builtins.int] listener_port: SLB listening port.
        :param pulumi.Input[_builtins.str] listener_protocol: The protocol that is used to forward requests. Default value: `HTTP`. Valid values: `HTTP`, `HTTPS`.
        :param pulumi.Input[_builtins.str] load_balance_type: The type of the SLB instance. Default value: `clb`. Valid values: `clb`, `alb`.
        :param pulumi.Input[_builtins.str] namespace_id: The ID of Namespace. It can contain 2 to 32 lowercase characters.The value is in format `{RegionId}:{namespace}`.
        :param pulumi.Input[Sequence[pulumi.Input[Union['IngressRuleArgs', 'IngressRuleArgsDict']]]] rules: Forwarding rules. Forward traffic to the specified application according to the domain name and path. See `rules` below.
        :param pulumi.Input[_builtins.str] slb_id: SLB ID.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _IngressState.__new__(_IngressState)

        __props__.__dict__["cert_id"] = cert_id
        __props__.__dict__["cert_ids"] = cert_ids
        __props__.__dict__["default_rule"] = default_rule
        __props__.__dict__["description"] = description
        __props__.__dict__["listener_port"] = listener_port
        __props__.__dict__["listener_protocol"] = listener_protocol
        __props__.__dict__["load_balance_type"] = load_balance_type
        __props__.__dict__["namespace_id"] = namespace_id
        __props__.__dict__["rules"] = rules
        __props__.__dict__["slb_id"] = slb_id
        return Ingress(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="certId")
    def cert_id(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The certificate ID of the HTTPS listener. The `cert_id` takes effect only when `load_balance_type` is set to `clb`.
        """
        return pulumi.get(self, "cert_id")

    @_builtins.property
    @pulumi.getter(name="certIds")
    def cert_ids(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The certificate IDs of the HTTPS listener, and multiple certificate IDs are separated by commas. The `cert_ids` takes effect only when `load_balance_type` is set to `alb`.
        """
        return pulumi.get(self, "cert_ids")

    @_builtins.property
    @pulumi.getter(name="defaultRule")
    def default_rule(self) -> pulumi.Output[Optional['outputs.IngressDefaultRule']]:
        """
        Default Rule. See `default_rule` below.
        """
        return pulumi.get(self, "default_rule")

    @_builtins.property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Description.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter(name="listenerPort")
    def listener_port(self) -> pulumi.Output[_builtins.int]:
        """
        SLB listening port.
        """
        return pulumi.get(self, "listener_port")

    @_builtins.property
    @pulumi.getter(name="listenerProtocol")
    def listener_protocol(self) -> pulumi.Output[_builtins.str]:
        """
        The protocol that is used to forward requests. Default value: `HTTP`. Valid values: `HTTP`, `HTTPS`.
        """
        return pulumi.get(self, "listener_protocol")

    @_builtins.property
    @pulumi.getter(name="loadBalanceType")
    def load_balance_type(self) -> pulumi.Output[_builtins.str]:
        """
        The type of the SLB instance. Default value: `clb`. Valid values: `clb`, `alb`.
        """
        return pulumi.get(self, "load_balance_type")

    @_builtins.property
    @pulumi.getter(name="namespaceId")
    def namespace_id(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of Namespace. It can contain 2 to 32 lowercase characters.The value is in format `{RegionId}:{namespace}`.
        """
        return pulumi.get(self, "namespace_id")

    @_builtins.property
    @pulumi.getter
    def rules(self) -> pulumi.Output[Sequence['outputs.IngressRule']]:
        """
        Forwarding rules. Forward traffic to the specified application according to the domain name and path. See `rules` below.
        """
        return pulumi.get(self, "rules")

    @_builtins.property
    @pulumi.getter(name="slbId")
    def slb_id(self) -> pulumi.Output[_builtins.str]:
        """
        SLB ID.
        """
        return pulumi.get(self, "slb_id")

