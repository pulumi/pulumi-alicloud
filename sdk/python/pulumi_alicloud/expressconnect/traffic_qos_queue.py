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

__all__ = ['TrafficQosQueueArgs', 'TrafficQosQueue']

@pulumi.input_type
class TrafficQosQueueArgs:
    def __init__(__self__, *,
                 qos_id: pulumi.Input[_builtins.str],
                 queue_type: pulumi.Input[_builtins.str],
                 bandwidth_percent: Optional[pulumi.Input[_builtins.str]] = None,
                 queue_description: Optional[pulumi.Input[_builtins.str]] = None,
                 queue_name: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a TrafficQosQueue resource.
        :param pulumi.Input[_builtins.str] qos_id: The QoS policy ID.
        :param pulumi.Input[_builtins.str] queue_type: QoS queue type, value:
               - **High**: High priority queue.
               - **Medium**: Normal priority queue.
               - **Default**: the Default priority queue.
               > **NOTE:**  Default priority queue cannot be created.
        :param pulumi.Input[_builtins.str] bandwidth_percent: QoS queue bandwidth percentage.
               
               - When the QoS queue type is **Medium**, this field must be entered. Valid values: 1 to 100.
               - When the QoS queue type is **Default**, this field is "-".
        :param pulumi.Input[_builtins.str] queue_description: The description of the QoS queue.  The length is 0 to 256 characters and cannot start with 'http:// 'or 'https.
        :param pulumi.Input[_builtins.str] queue_name: The name of the QoS queue.  The length is 0 to 128 characters and cannot start with 'http:// 'or 'https.
        """
        pulumi.set(__self__, "qos_id", qos_id)
        pulumi.set(__self__, "queue_type", queue_type)
        if bandwidth_percent is not None:
            pulumi.set(__self__, "bandwidth_percent", bandwidth_percent)
        if queue_description is not None:
            pulumi.set(__self__, "queue_description", queue_description)
        if queue_name is not None:
            pulumi.set(__self__, "queue_name", queue_name)

    @_builtins.property
    @pulumi.getter(name="qosId")
    def qos_id(self) -> pulumi.Input[_builtins.str]:
        """
        The QoS policy ID.
        """
        return pulumi.get(self, "qos_id")

    @qos_id.setter
    def qos_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "qos_id", value)

    @_builtins.property
    @pulumi.getter(name="queueType")
    def queue_type(self) -> pulumi.Input[_builtins.str]:
        """
        QoS queue type, value:
        - **High**: High priority queue.
        - **Medium**: Normal priority queue.
        - **Default**: the Default priority queue.
        > **NOTE:**  Default priority queue cannot be created.
        """
        return pulumi.get(self, "queue_type")

    @queue_type.setter
    def queue_type(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "queue_type", value)

    @_builtins.property
    @pulumi.getter(name="bandwidthPercent")
    def bandwidth_percent(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        QoS queue bandwidth percentage.

        - When the QoS queue type is **Medium**, this field must be entered. Valid values: 1 to 100.
        - When the QoS queue type is **Default**, this field is "-".
        """
        return pulumi.get(self, "bandwidth_percent")

    @bandwidth_percent.setter
    def bandwidth_percent(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "bandwidth_percent", value)

    @_builtins.property
    @pulumi.getter(name="queueDescription")
    def queue_description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The description of the QoS queue.  The length is 0 to 256 characters and cannot start with 'http:// 'or 'https.
        """
        return pulumi.get(self, "queue_description")

    @queue_description.setter
    def queue_description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "queue_description", value)

    @_builtins.property
    @pulumi.getter(name="queueName")
    def queue_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the QoS queue.  The length is 0 to 128 characters and cannot start with 'http:// 'or 'https.
        """
        return pulumi.get(self, "queue_name")

    @queue_name.setter
    def queue_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "queue_name", value)


@pulumi.input_type
class _TrafficQosQueueState:
    def __init__(__self__, *,
                 bandwidth_percent: Optional[pulumi.Input[_builtins.str]] = None,
                 qos_id: Optional[pulumi.Input[_builtins.str]] = None,
                 queue_description: Optional[pulumi.Input[_builtins.str]] = None,
                 queue_id: Optional[pulumi.Input[_builtins.str]] = None,
                 queue_name: Optional[pulumi.Input[_builtins.str]] = None,
                 queue_type: Optional[pulumi.Input[_builtins.str]] = None,
                 status: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering TrafficQosQueue resources.
        :param pulumi.Input[_builtins.str] bandwidth_percent: QoS queue bandwidth percentage.
               
               - When the QoS queue type is **Medium**, this field must be entered. Valid values: 1 to 100.
               - When the QoS queue type is **Default**, this field is "-".
        :param pulumi.Input[_builtins.str] qos_id: The QoS policy ID.
        :param pulumi.Input[_builtins.str] queue_description: The description of the QoS queue.  The length is 0 to 256 characters and cannot start with 'http:// 'or 'https.
        :param pulumi.Input[_builtins.str] queue_id: The QoS queue ID.
        :param pulumi.Input[_builtins.str] queue_name: The name of the QoS queue.  The length is 0 to 128 characters and cannot start with 'http:// 'or 'https.
        :param pulumi.Input[_builtins.str] queue_type: QoS queue type, value:
               - **High**: High priority queue.
               - **Medium**: Normal priority queue.
               - **Default**: the Default priority queue.
               > **NOTE:**  Default priority queue cannot be created.
        :param pulumi.Input[_builtins.str] status: The status of the resource.
        """
        if bandwidth_percent is not None:
            pulumi.set(__self__, "bandwidth_percent", bandwidth_percent)
        if qos_id is not None:
            pulumi.set(__self__, "qos_id", qos_id)
        if queue_description is not None:
            pulumi.set(__self__, "queue_description", queue_description)
        if queue_id is not None:
            pulumi.set(__self__, "queue_id", queue_id)
        if queue_name is not None:
            pulumi.set(__self__, "queue_name", queue_name)
        if queue_type is not None:
            pulumi.set(__self__, "queue_type", queue_type)
        if status is not None:
            pulumi.set(__self__, "status", status)

    @_builtins.property
    @pulumi.getter(name="bandwidthPercent")
    def bandwidth_percent(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        QoS queue bandwidth percentage.

        - When the QoS queue type is **Medium**, this field must be entered. Valid values: 1 to 100.
        - When the QoS queue type is **Default**, this field is "-".
        """
        return pulumi.get(self, "bandwidth_percent")

    @bandwidth_percent.setter
    def bandwidth_percent(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "bandwidth_percent", value)

    @_builtins.property
    @pulumi.getter(name="qosId")
    def qos_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The QoS policy ID.
        """
        return pulumi.get(self, "qos_id")

    @qos_id.setter
    def qos_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "qos_id", value)

    @_builtins.property
    @pulumi.getter(name="queueDescription")
    def queue_description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The description of the QoS queue.  The length is 0 to 256 characters and cannot start with 'http:// 'or 'https.
        """
        return pulumi.get(self, "queue_description")

    @queue_description.setter
    def queue_description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "queue_description", value)

    @_builtins.property
    @pulumi.getter(name="queueId")
    def queue_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The QoS queue ID.
        """
        return pulumi.get(self, "queue_id")

    @queue_id.setter
    def queue_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "queue_id", value)

    @_builtins.property
    @pulumi.getter(name="queueName")
    def queue_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the QoS queue.  The length is 0 to 128 characters and cannot start with 'http:// 'or 'https.
        """
        return pulumi.get(self, "queue_name")

    @queue_name.setter
    def queue_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "queue_name", value)

    @_builtins.property
    @pulumi.getter(name="queueType")
    def queue_type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        QoS queue type, value:
        - **High**: High priority queue.
        - **Medium**: Normal priority queue.
        - **Default**: the Default priority queue.
        > **NOTE:**  Default priority queue cannot be created.
        """
        return pulumi.get(self, "queue_type")

    @queue_type.setter
    def queue_type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "queue_type", value)

    @_builtins.property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The status of the resource.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "status", value)


@pulumi.type_token("alicloud:expressconnect/trafficQosQueue:TrafficQosQueue")
class TrafficQosQueue(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 bandwidth_percent: Optional[pulumi.Input[_builtins.str]] = None,
                 qos_id: Optional[pulumi.Input[_builtins.str]] = None,
                 queue_description: Optional[pulumi.Input[_builtins.str]] = None,
                 queue_name: Optional[pulumi.Input[_builtins.str]] = None,
                 queue_type: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Provides a Express Connect Traffic Qos Queue resource. Express Connect Traffic QoS Queue.

        For information about Express Connect Traffic Qos Queue and how to use it, see [What is Traffic Qos Queue](https://next.api.alibabacloud.com/document/Vpc/2016-04-28/CreateExpressConnectTrafficQosQueue).

        > **NOTE:** Available since v1.224.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        default = alicloud.expressconnect.get_physical_connections(name_regex="preserved-NODELETING")
        create_qos = alicloud.expressconnect.TrafficQos("createQos",
            qos_name=name,
            qos_description="terraform-example")
        associate_qos = alicloud.expressconnect.TrafficQosAssociation("associateQos",
            instance_id=default.ids[1],
            qos_id=create_qos.id,
            instance_type="PHYSICALCONNECTION")
        create_qos_queue = alicloud.expressconnect.TrafficQosQueue("createQosQueue",
            qos_id=create_qos.id,
            bandwidth_percent="60",
            queue_description="terraform-example",
            queue_name=name,
            queue_type="Medium")
        ```

        ## Import

        Express Connect Traffic Qos Queue can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:expressconnect/trafficQosQueue:TrafficQosQueue example <qos_id>:<queue_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] bandwidth_percent: QoS queue bandwidth percentage.
               
               - When the QoS queue type is **Medium**, this field must be entered. Valid values: 1 to 100.
               - When the QoS queue type is **Default**, this field is "-".
        :param pulumi.Input[_builtins.str] qos_id: The QoS policy ID.
        :param pulumi.Input[_builtins.str] queue_description: The description of the QoS queue.  The length is 0 to 256 characters and cannot start with 'http:// 'or 'https.
        :param pulumi.Input[_builtins.str] queue_name: The name of the QoS queue.  The length is 0 to 128 characters and cannot start with 'http:// 'or 'https.
        :param pulumi.Input[_builtins.str] queue_type: QoS queue type, value:
               - **High**: High priority queue.
               - **Medium**: Normal priority queue.
               - **Default**: the Default priority queue.
               > **NOTE:**  Default priority queue cannot be created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: TrafficQosQueueArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Express Connect Traffic Qos Queue resource. Express Connect Traffic QoS Queue.

        For information about Express Connect Traffic Qos Queue and how to use it, see [What is Traffic Qos Queue](https://next.api.alibabacloud.com/document/Vpc/2016-04-28/CreateExpressConnectTrafficQosQueue).

        > **NOTE:** Available since v1.224.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        default = alicloud.expressconnect.get_physical_connections(name_regex="preserved-NODELETING")
        create_qos = alicloud.expressconnect.TrafficQos("createQos",
            qos_name=name,
            qos_description="terraform-example")
        associate_qos = alicloud.expressconnect.TrafficQosAssociation("associateQos",
            instance_id=default.ids[1],
            qos_id=create_qos.id,
            instance_type="PHYSICALCONNECTION")
        create_qos_queue = alicloud.expressconnect.TrafficQosQueue("createQosQueue",
            qos_id=create_qos.id,
            bandwidth_percent="60",
            queue_description="terraform-example",
            queue_name=name,
            queue_type="Medium")
        ```

        ## Import

        Express Connect Traffic Qos Queue can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:expressconnect/trafficQosQueue:TrafficQosQueue example <qos_id>:<queue_id>
        ```

        :param str resource_name: The name of the resource.
        :param TrafficQosQueueArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TrafficQosQueueArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 bandwidth_percent: Optional[pulumi.Input[_builtins.str]] = None,
                 qos_id: Optional[pulumi.Input[_builtins.str]] = None,
                 queue_description: Optional[pulumi.Input[_builtins.str]] = None,
                 queue_name: Optional[pulumi.Input[_builtins.str]] = None,
                 queue_type: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TrafficQosQueueArgs.__new__(TrafficQosQueueArgs)

            __props__.__dict__["bandwidth_percent"] = bandwidth_percent
            if qos_id is None and not opts.urn:
                raise TypeError("Missing required property 'qos_id'")
            __props__.__dict__["qos_id"] = qos_id
            __props__.__dict__["queue_description"] = queue_description
            __props__.__dict__["queue_name"] = queue_name
            if queue_type is None and not opts.urn:
                raise TypeError("Missing required property 'queue_type'")
            __props__.__dict__["queue_type"] = queue_type
            __props__.__dict__["queue_id"] = None
            __props__.__dict__["status"] = None
        super(TrafficQosQueue, __self__).__init__(
            'alicloud:expressconnect/trafficQosQueue:TrafficQosQueue',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            bandwidth_percent: Optional[pulumi.Input[_builtins.str]] = None,
            qos_id: Optional[pulumi.Input[_builtins.str]] = None,
            queue_description: Optional[pulumi.Input[_builtins.str]] = None,
            queue_id: Optional[pulumi.Input[_builtins.str]] = None,
            queue_name: Optional[pulumi.Input[_builtins.str]] = None,
            queue_type: Optional[pulumi.Input[_builtins.str]] = None,
            status: Optional[pulumi.Input[_builtins.str]] = None) -> 'TrafficQosQueue':
        """
        Get an existing TrafficQosQueue resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] bandwidth_percent: QoS queue bandwidth percentage.
               
               - When the QoS queue type is **Medium**, this field must be entered. Valid values: 1 to 100.
               - When the QoS queue type is **Default**, this field is "-".
        :param pulumi.Input[_builtins.str] qos_id: The QoS policy ID.
        :param pulumi.Input[_builtins.str] queue_description: The description of the QoS queue.  The length is 0 to 256 characters and cannot start with 'http:// 'or 'https.
        :param pulumi.Input[_builtins.str] queue_id: The QoS queue ID.
        :param pulumi.Input[_builtins.str] queue_name: The name of the QoS queue.  The length is 0 to 128 characters and cannot start with 'http:// 'or 'https.
        :param pulumi.Input[_builtins.str] queue_type: QoS queue type, value:
               - **High**: High priority queue.
               - **Medium**: Normal priority queue.
               - **Default**: the Default priority queue.
               > **NOTE:**  Default priority queue cannot be created.
        :param pulumi.Input[_builtins.str] status: The status of the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TrafficQosQueueState.__new__(_TrafficQosQueueState)

        __props__.__dict__["bandwidth_percent"] = bandwidth_percent
        __props__.__dict__["qos_id"] = qos_id
        __props__.__dict__["queue_description"] = queue_description
        __props__.__dict__["queue_id"] = queue_id
        __props__.__dict__["queue_name"] = queue_name
        __props__.__dict__["queue_type"] = queue_type
        __props__.__dict__["status"] = status
        return TrafficQosQueue(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="bandwidthPercent")
    def bandwidth_percent(self) -> pulumi.Output[_builtins.str]:
        """
        QoS queue bandwidth percentage.

        - When the QoS queue type is **Medium**, this field must be entered. Valid values: 1 to 100.
        - When the QoS queue type is **Default**, this field is "-".
        """
        return pulumi.get(self, "bandwidth_percent")

    @_builtins.property
    @pulumi.getter(name="qosId")
    def qos_id(self) -> pulumi.Output[_builtins.str]:
        """
        The QoS policy ID.
        """
        return pulumi.get(self, "qos_id")

    @_builtins.property
    @pulumi.getter(name="queueDescription")
    def queue_description(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The description of the QoS queue.  The length is 0 to 256 characters and cannot start with 'http:// 'or 'https.
        """
        return pulumi.get(self, "queue_description")

    @_builtins.property
    @pulumi.getter(name="queueId")
    def queue_id(self) -> pulumi.Output[_builtins.str]:
        """
        The QoS queue ID.
        """
        return pulumi.get(self, "queue_id")

    @_builtins.property
    @pulumi.getter(name="queueName")
    def queue_name(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The name of the QoS queue.  The length is 0 to 128 characters and cannot start with 'http:// 'or 'https.
        """
        return pulumi.get(self, "queue_name")

    @_builtins.property
    @pulumi.getter(name="queueType")
    def queue_type(self) -> pulumi.Output[_builtins.str]:
        """
        QoS queue type, value:
        - **High**: High priority queue.
        - **Medium**: Normal priority queue.
        - **Default**: the Default priority queue.
        > **NOTE:**  Default priority queue cannot be created.
        """
        return pulumi.get(self, "queue_type")

    @_builtins.property
    @pulumi.getter
    def status(self) -> pulumi.Output[_builtins.str]:
        """
        The status of the resource.
        """
        return pulumi.get(self, "status")

