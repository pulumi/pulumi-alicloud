# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
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

__all__ = [
    'LoadBalancerZoneMappingArgs',
    'LoadBalancerZoneMappingArgsDict',
    'LoadBalancerZoneMappingLoadBalancerAddressArgs',
    'LoadBalancerZoneMappingLoadBalancerAddressArgsDict',
    'ServerGroupConnectionDrainConfigArgs',
    'ServerGroupConnectionDrainConfigArgsDict',
    'ServerGroupHealthCheckConfigArgs',
    'ServerGroupHealthCheckConfigArgsDict',
    'ServerGroupServerArgs',
    'ServerGroupServerArgsDict',
]

MYPY = False

if not MYPY:
    class LoadBalancerZoneMappingArgsDict(TypedDict):
        vswitch_id: pulumi.Input[str]
        """
        The ID of the vSwitch that corresponds to the zone. Each zone can use only one vSwitch and subnet.
        """
        zone_id: pulumi.Input[str]
        """
        The ID of the zone to which the Gateway Load Balancer instance belongs.
        """
        load_balancer_addresses: NotRequired[pulumi.Input[Sequence[pulumi.Input['LoadBalancerZoneMappingLoadBalancerAddressArgsDict']]]]
        """
        The addresses of the Gateway Load Balancer instance.
        """
elif False:
    LoadBalancerZoneMappingArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class LoadBalancerZoneMappingArgs:
    def __init__(__self__, *,
                 vswitch_id: pulumi.Input[str],
                 zone_id: pulumi.Input[str],
                 load_balancer_addresses: Optional[pulumi.Input[Sequence[pulumi.Input['LoadBalancerZoneMappingLoadBalancerAddressArgs']]]] = None):
        """
        :param pulumi.Input[str] vswitch_id: The ID of the vSwitch that corresponds to the zone. Each zone can use only one vSwitch and subnet.
        :param pulumi.Input[str] zone_id: The ID of the zone to which the Gateway Load Balancer instance belongs.
        :param pulumi.Input[Sequence[pulumi.Input['LoadBalancerZoneMappingLoadBalancerAddressArgs']]] load_balancer_addresses: The addresses of the Gateway Load Balancer instance.
        """
        pulumi.set(__self__, "vswitch_id", vswitch_id)
        pulumi.set(__self__, "zone_id", zone_id)
        if load_balancer_addresses is not None:
            pulumi.set(__self__, "load_balancer_addresses", load_balancer_addresses)

    @property
    @pulumi.getter(name="vswitchId")
    def vswitch_id(self) -> pulumi.Input[str]:
        """
        The ID of the vSwitch that corresponds to the zone. Each zone can use only one vSwitch and subnet.
        """
        return pulumi.get(self, "vswitch_id")

    @vswitch_id.setter
    def vswitch_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "vswitch_id", value)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Input[str]:
        """
        The ID of the zone to which the Gateway Load Balancer instance belongs.
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "zone_id", value)

    @property
    @pulumi.getter(name="loadBalancerAddresses")
    def load_balancer_addresses(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['LoadBalancerZoneMappingLoadBalancerAddressArgs']]]]:
        """
        The addresses of the Gateway Load Balancer instance.
        """
        return pulumi.get(self, "load_balancer_addresses")

    @load_balancer_addresses.setter
    def load_balancer_addresses(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['LoadBalancerZoneMappingLoadBalancerAddressArgs']]]]):
        pulumi.set(self, "load_balancer_addresses", value)


if not MYPY:
    class LoadBalancerZoneMappingLoadBalancerAddressArgsDict(TypedDict):
        eni_id: NotRequired[pulumi.Input[str]]
        """
        The ID of the ENI.
        """
        private_ipv4_address: NotRequired[pulumi.Input[str]]
        """
        IPv4 private network address.
        """
elif False:
    LoadBalancerZoneMappingLoadBalancerAddressArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class LoadBalancerZoneMappingLoadBalancerAddressArgs:
    def __init__(__self__, *,
                 eni_id: Optional[pulumi.Input[str]] = None,
                 private_ipv4_address: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] eni_id: The ID of the ENI.
        :param pulumi.Input[str] private_ipv4_address: IPv4 private network address.
        """
        if eni_id is not None:
            pulumi.set(__self__, "eni_id", eni_id)
        if private_ipv4_address is not None:
            pulumi.set(__self__, "private_ipv4_address", private_ipv4_address)

    @property
    @pulumi.getter(name="eniId")
    def eni_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the ENI.
        """
        return pulumi.get(self, "eni_id")

    @eni_id.setter
    def eni_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "eni_id", value)

    @property
    @pulumi.getter(name="privateIpv4Address")
    def private_ipv4_address(self) -> Optional[pulumi.Input[str]]:
        """
        IPv4 private network address.
        """
        return pulumi.get(self, "private_ipv4_address")

    @private_ipv4_address.setter
    def private_ipv4_address(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "private_ipv4_address", value)


if not MYPY:
    class ServerGroupConnectionDrainConfigArgsDict(TypedDict):
        connection_drain_enabled: NotRequired[pulumi.Input[bool]]
        """
        Whether to open the connection graceful interrupt. Value:
        """
        connection_drain_timeout: NotRequired[pulumi.Input[int]]
        """
        Connection Grace interrupt timeout.

        Unit: seconds.

        Value range: 1~3600.
        """
elif False:
    ServerGroupConnectionDrainConfigArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class ServerGroupConnectionDrainConfigArgs:
    def __init__(__self__, *,
                 connection_drain_enabled: Optional[pulumi.Input[bool]] = None,
                 connection_drain_timeout: Optional[pulumi.Input[int]] = None):
        """
        :param pulumi.Input[bool] connection_drain_enabled: Whether to open the connection graceful interrupt. Value:
        :param pulumi.Input[int] connection_drain_timeout: Connection Grace interrupt timeout.
               
               Unit: seconds.
               
               Value range: 1~3600.
        """
        if connection_drain_enabled is not None:
            pulumi.set(__self__, "connection_drain_enabled", connection_drain_enabled)
        if connection_drain_timeout is not None:
            pulumi.set(__self__, "connection_drain_timeout", connection_drain_timeout)

    @property
    @pulumi.getter(name="connectionDrainEnabled")
    def connection_drain_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to open the connection graceful interrupt. Value:
        """
        return pulumi.get(self, "connection_drain_enabled")

    @connection_drain_enabled.setter
    def connection_drain_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "connection_drain_enabled", value)

    @property
    @pulumi.getter(name="connectionDrainTimeout")
    def connection_drain_timeout(self) -> Optional[pulumi.Input[int]]:
        """
        Connection Grace interrupt timeout.

        Unit: seconds.

        Value range: 1~3600.
        """
        return pulumi.get(self, "connection_drain_timeout")

    @connection_drain_timeout.setter
    def connection_drain_timeout(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "connection_drain_timeout", value)


if not MYPY:
    class ServerGroupHealthCheckConfigArgsDict(TypedDict):
        health_check_connect_port: NotRequired[pulumi.Input[int]]
        """
        The port of the backend server used for health check.

        Value range: **1 to 65535**.

        Default value: `80`.
        """
        health_check_connect_timeout: NotRequired[pulumi.Input[int]]
        """
        The maximum timeout period for health check responses.

        Unit: seconds.

        Value range: **1 to 300**.

        Default value: `5`.
        """
        health_check_domain: NotRequired[pulumi.Input[str]]
        """
        The domain name used for health checks. Value:
        - **$SERVER_IP (default)**: Use the internal IP address of the backend server.
        """
        health_check_enabled: NotRequired[pulumi.Input[bool]]
        """
        Whether to enable health check. Value:
        - **true (default)**: enabled.
        """
        health_check_http_codes: NotRequired[pulumi.Input[Sequence[pulumi.Input[str]]]]
        """
        Health status return code list.
        """
        health_check_interval: NotRequired[pulumi.Input[int]]
        """
        The time interval of the health check.

        Unit: seconds.

        Value range: **1~50**.

        Default value: `10`.
        """
        health_check_path: NotRequired[pulumi.Input[str]]
        """
        Health check path.

        It can be 1 to 80 characters in length and can only use upper and lower case letters, digits, dashes (-), forward slashes (/), half-width periods (.), percent signs (%), and half-width question marks (?), Pound sign (#) and and(&) and extended character set_;~! ()*[]@$^: ',+ =

        Must start with a forward slash (/).

        > **NOTE:**  This parameter takes effect only when the HealthCheckProtocol is HTTP.
        """
        health_check_protocol: NotRequired[pulumi.Input[str]]
        """
        Health check protocol, value:
        - `TCP` (default): Sends a SYN handshake packet to check whether the server port is alive.
        - `HTTP`: Sends a GET request to simulate the access behavior of the browser to check whether the server application is healthy.
        """
        healthy_threshold: NotRequired[pulumi.Input[int]]
        """
        After the number of consecutive successful health checks, the health check status of the backend server is determined as successful from failed.

        Value range: **2 to 10**.

        Default value: `2`.
        """
        unhealthy_threshold: NotRequired[pulumi.Input[int]]
        """
        The number of consecutive failed health checks that determine the health check status of the backend server from success to failure.

        Value range: **2 to 10**.

        Default value: `2`.
        """
elif False:
    ServerGroupHealthCheckConfigArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class ServerGroupHealthCheckConfigArgs:
    def __init__(__self__, *,
                 health_check_connect_port: Optional[pulumi.Input[int]] = None,
                 health_check_connect_timeout: Optional[pulumi.Input[int]] = None,
                 health_check_domain: Optional[pulumi.Input[str]] = None,
                 health_check_enabled: Optional[pulumi.Input[bool]] = None,
                 health_check_http_codes: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 health_check_interval: Optional[pulumi.Input[int]] = None,
                 health_check_path: Optional[pulumi.Input[str]] = None,
                 health_check_protocol: Optional[pulumi.Input[str]] = None,
                 healthy_threshold: Optional[pulumi.Input[int]] = None,
                 unhealthy_threshold: Optional[pulumi.Input[int]] = None):
        """
        :param pulumi.Input[int] health_check_connect_port: The port of the backend server used for health check.
               
               Value range: **1 to 65535**.
               
               Default value: `80`.
        :param pulumi.Input[int] health_check_connect_timeout: The maximum timeout period for health check responses.
               
               Unit: seconds.
               
               Value range: **1 to 300**.
               
               Default value: `5`.
        :param pulumi.Input[str] health_check_domain: The domain name used for health checks. Value:
               - **$SERVER_IP (default)**: Use the internal IP address of the backend server.
        :param pulumi.Input[bool] health_check_enabled: Whether to enable health check. Value:
               - **true (default)**: enabled.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] health_check_http_codes: Health status return code list.
        :param pulumi.Input[int] health_check_interval: The time interval of the health check.
               
               Unit: seconds.
               
               Value range: **1~50**.
               
               Default value: `10`.
        :param pulumi.Input[str] health_check_path: Health check path.
               
               It can be 1 to 80 characters in length and can only use upper and lower case letters, digits, dashes (-), forward slashes (/), half-width periods (.), percent signs (%), and half-width question marks (?), Pound sign (#) and and(&) and extended character set_;~! ()*[]@$^: ',+ =
               
               Must start with a forward slash (/).
               
               > **NOTE:**  This parameter takes effect only when the HealthCheckProtocol is HTTP.
        :param pulumi.Input[str] health_check_protocol: Health check protocol, value:
               - `TCP` (default): Sends a SYN handshake packet to check whether the server port is alive.
               - `HTTP`: Sends a GET request to simulate the access behavior of the browser to check whether the server application is healthy.
        :param pulumi.Input[int] healthy_threshold: After the number of consecutive successful health checks, the health check status of the backend server is determined as successful from failed.
               
               Value range: **2 to 10**.
               
               Default value: `2`.
        :param pulumi.Input[int] unhealthy_threshold: The number of consecutive failed health checks that determine the health check status of the backend server from success to failure.
               
               Value range: **2 to 10**.
               
               Default value: `2`.
        """
        if health_check_connect_port is not None:
            pulumi.set(__self__, "health_check_connect_port", health_check_connect_port)
        if health_check_connect_timeout is not None:
            pulumi.set(__self__, "health_check_connect_timeout", health_check_connect_timeout)
        if health_check_domain is not None:
            pulumi.set(__self__, "health_check_domain", health_check_domain)
        if health_check_enabled is not None:
            pulumi.set(__self__, "health_check_enabled", health_check_enabled)
        if health_check_http_codes is not None:
            pulumi.set(__self__, "health_check_http_codes", health_check_http_codes)
        if health_check_interval is not None:
            pulumi.set(__self__, "health_check_interval", health_check_interval)
        if health_check_path is not None:
            pulumi.set(__self__, "health_check_path", health_check_path)
        if health_check_protocol is not None:
            pulumi.set(__self__, "health_check_protocol", health_check_protocol)
        if healthy_threshold is not None:
            pulumi.set(__self__, "healthy_threshold", healthy_threshold)
        if unhealthy_threshold is not None:
            pulumi.set(__self__, "unhealthy_threshold", unhealthy_threshold)

    @property
    @pulumi.getter(name="healthCheckConnectPort")
    def health_check_connect_port(self) -> Optional[pulumi.Input[int]]:
        """
        The port of the backend server used for health check.

        Value range: **1 to 65535**.

        Default value: `80`.
        """
        return pulumi.get(self, "health_check_connect_port")

    @health_check_connect_port.setter
    def health_check_connect_port(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "health_check_connect_port", value)

    @property
    @pulumi.getter(name="healthCheckConnectTimeout")
    def health_check_connect_timeout(self) -> Optional[pulumi.Input[int]]:
        """
        The maximum timeout period for health check responses.

        Unit: seconds.

        Value range: **1 to 300**.

        Default value: `5`.
        """
        return pulumi.get(self, "health_check_connect_timeout")

    @health_check_connect_timeout.setter
    def health_check_connect_timeout(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "health_check_connect_timeout", value)

    @property
    @pulumi.getter(name="healthCheckDomain")
    def health_check_domain(self) -> Optional[pulumi.Input[str]]:
        """
        The domain name used for health checks. Value:
        - **$SERVER_IP (default)**: Use the internal IP address of the backend server.
        """
        return pulumi.get(self, "health_check_domain")

    @health_check_domain.setter
    def health_check_domain(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "health_check_domain", value)

    @property
    @pulumi.getter(name="healthCheckEnabled")
    def health_check_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to enable health check. Value:
        - **true (default)**: enabled.
        """
        return pulumi.get(self, "health_check_enabled")

    @health_check_enabled.setter
    def health_check_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "health_check_enabled", value)

    @property
    @pulumi.getter(name="healthCheckHttpCodes")
    def health_check_http_codes(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Health status return code list.
        """
        return pulumi.get(self, "health_check_http_codes")

    @health_check_http_codes.setter
    def health_check_http_codes(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "health_check_http_codes", value)

    @property
    @pulumi.getter(name="healthCheckInterval")
    def health_check_interval(self) -> Optional[pulumi.Input[int]]:
        """
        The time interval of the health check.

        Unit: seconds.

        Value range: **1~50**.

        Default value: `10`.
        """
        return pulumi.get(self, "health_check_interval")

    @health_check_interval.setter
    def health_check_interval(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "health_check_interval", value)

    @property
    @pulumi.getter(name="healthCheckPath")
    def health_check_path(self) -> Optional[pulumi.Input[str]]:
        """
        Health check path.

        It can be 1 to 80 characters in length and can only use upper and lower case letters, digits, dashes (-), forward slashes (/), half-width periods (.), percent signs (%), and half-width question marks (?), Pound sign (#) and and(&) and extended character set_;~! ()*[]@$^: ',+ =

        Must start with a forward slash (/).

        > **NOTE:**  This parameter takes effect only when the HealthCheckProtocol is HTTP.
        """
        return pulumi.get(self, "health_check_path")

    @health_check_path.setter
    def health_check_path(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "health_check_path", value)

    @property
    @pulumi.getter(name="healthCheckProtocol")
    def health_check_protocol(self) -> Optional[pulumi.Input[str]]:
        """
        Health check protocol, value:
        - `TCP` (default): Sends a SYN handshake packet to check whether the server port is alive.
        - `HTTP`: Sends a GET request to simulate the access behavior of the browser to check whether the server application is healthy.
        """
        return pulumi.get(self, "health_check_protocol")

    @health_check_protocol.setter
    def health_check_protocol(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "health_check_protocol", value)

    @property
    @pulumi.getter(name="healthyThreshold")
    def healthy_threshold(self) -> Optional[pulumi.Input[int]]:
        """
        After the number of consecutive successful health checks, the health check status of the backend server is determined as successful from failed.

        Value range: **2 to 10**.

        Default value: `2`.
        """
        return pulumi.get(self, "healthy_threshold")

    @healthy_threshold.setter
    def healthy_threshold(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "healthy_threshold", value)

    @property
    @pulumi.getter(name="unhealthyThreshold")
    def unhealthy_threshold(self) -> Optional[pulumi.Input[int]]:
        """
        The number of consecutive failed health checks that determine the health check status of the backend server from success to failure.

        Value range: **2 to 10**.

        Default value: `2`.
        """
        return pulumi.get(self, "unhealthy_threshold")

    @unhealthy_threshold.setter
    def unhealthy_threshold(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "unhealthy_threshold", value)


if not MYPY:
    class ServerGroupServerArgsDict(TypedDict):
        server_id: pulumi.Input[str]
        """
        The ID of the backend server.
        """
        server_type: pulumi.Input[str]
        """
        Backend server type. Valid values:
        - `Ecs`: ECS instance.
        - `Eni`: ENI instance.
        - `Eci`: ECI elastic container.
        - `Ip`: Ip address.
        """
        port: NotRequired[pulumi.Input[int]]
        """
        The port used by the backend server.
        """
        server_group_id: NotRequired[pulumi.Input[str]]
        """
        The server group ID.
        """
        server_ip: NotRequired[pulumi.Input[str]]
        """
        Server ip.
        """
        status: NotRequired[pulumi.Input[str]]
        """
        Server group status. Value:
        """
elif False:
    ServerGroupServerArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class ServerGroupServerArgs:
    def __init__(__self__, *,
                 server_id: pulumi.Input[str],
                 server_type: pulumi.Input[str],
                 port: Optional[pulumi.Input[int]] = None,
                 server_group_id: Optional[pulumi.Input[str]] = None,
                 server_ip: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] server_id: The ID of the backend server.
        :param pulumi.Input[str] server_type: Backend server type. Valid values:
               - `Ecs`: ECS instance.
               - `Eni`: ENI instance.
               - `Eci`: ECI elastic container.
               - `Ip`: Ip address.
        :param pulumi.Input[int] port: The port used by the backend server.
        :param pulumi.Input[str] server_group_id: The server group ID.
        :param pulumi.Input[str] server_ip: Server ip.
        :param pulumi.Input[str] status: Server group status. Value:
        """
        pulumi.set(__self__, "server_id", server_id)
        pulumi.set(__self__, "server_type", server_type)
        if port is not None:
            pulumi.set(__self__, "port", port)
        if server_group_id is not None:
            pulumi.set(__self__, "server_group_id", server_group_id)
        if server_ip is not None:
            pulumi.set(__self__, "server_ip", server_ip)
        if status is not None:
            pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter(name="serverId")
    def server_id(self) -> pulumi.Input[str]:
        """
        The ID of the backend server.
        """
        return pulumi.get(self, "server_id")

    @server_id.setter
    def server_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "server_id", value)

    @property
    @pulumi.getter(name="serverType")
    def server_type(self) -> pulumi.Input[str]:
        """
        Backend server type. Valid values:
        - `Ecs`: ECS instance.
        - `Eni`: ENI instance.
        - `Eci`: ECI elastic container.
        - `Ip`: Ip address.
        """
        return pulumi.get(self, "server_type")

    @server_type.setter
    def server_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "server_type", value)

    @property
    @pulumi.getter
    def port(self) -> Optional[pulumi.Input[int]]:
        """
        The port used by the backend server.
        """
        return pulumi.get(self, "port")

    @port.setter
    def port(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "port", value)

    @property
    @pulumi.getter(name="serverGroupId")
    def server_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The server group ID.
        """
        return pulumi.get(self, "server_group_id")

    @server_group_id.setter
    def server_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "server_group_id", value)

    @property
    @pulumi.getter(name="serverIp")
    def server_ip(self) -> Optional[pulumi.Input[str]]:
        """
        Server ip.
        """
        return pulumi.get(self, "server_ip")

    @server_ip.setter
    def server_ip(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "server_ip", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        Server group status. Value:
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

