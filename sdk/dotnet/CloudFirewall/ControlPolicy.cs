// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CloudFirewall
{
    /// <summary>
    /// Provides a Cloud Firewall Control Policy resource.
    /// 
    /// For information about Cloud Firewall Control Policy and how to use it, see [What is Control Policy](https://www.alibabacloud.com/help/doc-detail/138867.htm).
    /// 
    /// &gt; **NOTE:** Available since v1.129.0.
    /// 
    /// ## Example Usage
    /// 
    /// Basic Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using AliCloud = Pulumi.AliCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var config = new Config();
    ///     var name = config.Get("name") ?? "terraform-example";
    ///     var @default = new AliCloud.CloudFirewall.ControlPolicy("default", new()
    ///     {
    ///         Direction = "in",
    ///         ApplicationName = "ANY",
    ///         Description = name,
    ///         AclAction = "accept",
    ///         Source = "127.0.0.1/32",
    ///         SourceType = "net",
    ///         Destination = "127.0.0.2/32",
    ///         DestinationType = "net",
    ///         Proto = "ANY",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Cloud Firewall Control Policy can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:cloudfirewall/controlPolicy:ControlPolicy example &lt;acl_uuid&gt;:&lt;direction&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:cloudfirewall/controlPolicy:ControlPolicy")]
    public partial class ControlPolicy : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The action that Cloud Firewall performs on the traffic. Valid values: `accept`, `drop`, `log`.
        /// </summary>
        [Output("aclAction")]
        public Output<string> AclAction { get; private set; } = null!;

        /// <summary>
        /// (Available since v1.148.0) The unique ID of the access control policy.
        /// </summary>
        [Output("aclUuid")]
        public Output<string> AclUuid { get; private set; } = null!;

        /// <summary>
        /// The application type supported by the access control policy. Valid values: `ANY`, `HTTP`, `HTTPS`, `MQTT`, `Memcache`, `MongoDB`, `MySQL`, `RDP`, `Redis`, `SMTP`, `SMTPS`, `SSH`, `SSL`, `VNC`.
        /// &gt; **NOTE:** If `proto` is set to `TCP`, you can set `application_name` to any valid value. If `proto` is set to `UDP`, `ICMP`, or `ANY`, you can only set `application_name` to `ANY`.
        /// </summary>
        [Output("applicationName")]
        public Output<string?> ApplicationName { get; private set; } = null!;

        /// <summary>
        /// The application types supported by the access control policy.
        /// &gt; **NOTE:** If `proto` is set to `TCP`, you can set `application_name_list` to any valid value. If `proto` is set to `UDP`, `ICMP`, or `ANY`, you can only set `application_name_list` to `["ANY"]`. From version 1.232.0, You must specify at least one of the `application_name_list` and `application_name`. If you specify both `application_name_list` and `application_name`, only the `application_name_list` takes effect.
        /// </summary>
        [Output("applicationNameLists")]
        public Output<ImmutableArray<string>> ApplicationNameLists { get; private set; } = null!;

        /// <summary>
        /// (Available since v1.232.0) The time when the access control policy was created.
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// The description of the access control policy.
        /// </summary>
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// The destination port in the access control policy. **Note:** If `dest_port_type` is set to `port`, you must specify `dest_port`.
        /// </summary>
        [Output("destPort")]
        public Output<string> DestPort { get; private set; } = null!;

        /// <summary>
        /// The name of the destination port address book in the access control policy. **Note:** If `dest_port_type` is set to `group`, you must specify `dest_port_group`.
        /// </summary>
        [Output("destPortGroup")]
        public Output<string?> DestPortGroup { get; private set; } = null!;

        /// <summary>
        /// The type of the destination port in the access control policy. Valid values: `port`, `group`.
        /// </summary>
        [Output("destPortType")]
        public Output<string> DestPortType { get; private set; } = null!;

        /// <summary>
        /// The destination address in the access control policy.
        /// </summary>
        [Output("destination")]
        public Output<string> Destination { get; private set; } = null!;

        /// <summary>
        /// The type of the destination address in the access control policy. Valid values: `net`, `group`, `domain`, `location`.
        /// </summary>
        [Output("destinationType")]
        public Output<string> DestinationType { get; private set; } = null!;

        /// <summary>
        /// The direction of the traffic to which the access control policy applies. Valid values: `in`, `out`.
        /// </summary>
        [Output("direction")]
        public Output<string> Direction { get; private set; } = null!;

        /// <summary>
        /// The domain name resolution method of the access control policy. Valid values:
        /// - `FQDN`: Fully qualified domain name (FQDN)-based resolution.
        /// - `DNS`: DNS-based dynamic resolution.
        /// - `FQDN_AND_DNS`: FQDN and DNS-based dynamic resolution.
        /// </summary>
        [Output("domainResolveType")]
        public Output<string?> DomainResolveType { get; private set; } = null!;

        /// <summary>
        /// The time when the access control policy stops taking effect. The value is a UNIX timestamp. Unit: seconds. The value must be on the hour or on the half hour, and at least 30 minutes later than the start time.
        /// &gt; **NOTE:** If `repeat_type` is set to `None`, `Daily`, `Weekly`, or `Monthly`, `start_time` and `end_time` must be set.
        /// </summary>
        [Output("endTime")]
        public Output<int?> EndTime { get; private set; } = null!;

        /// <summary>
        /// The IP version supported by the access control policy. Default value: `4`. Valid values:
        /// </summary>
        [Output("ipVersion")]
        public Output<string> IpVersion { get; private set; } = null!;

        /// <summary>
        /// The language of the content within the request and response. Valid values: `zh`, `en`.
        /// </summary>
        [Output("lang")]
        public Output<string?> Lang { get; private set; } = null!;

        /// <summary>
        /// The protocol type supported by the access control policy. Valid values: `ANY`, ` TCP`, `UDP`, `ICMP`.
        /// </summary>
        [Output("proto")]
        public Output<string> Proto { get; private set; } = null!;

        /// <summary>
        /// The status of the access control policy. Valid values: `true`, `false`.
        /// </summary>
        [Output("release")]
        public Output<string> Release { get; private set; } = null!;

        /// <summary>
        /// The days of a week or of a month on which the access control policy takes effect. Valid values:
        /// - If `repeat_type` is set to `Weekly`. Valid values: `0` to `6`.
        /// - If `repeat_type` is set to `Monthly`. Valid values: `1` to `31`.
        /// &gt; **NOTE:** If `repeat_type` is set to `Weekly`, or `Monthly`, `repeat_days` must be set.
        /// </summary>
        [Output("repeatDays")]
        public Output<ImmutableArray<int>> RepeatDays { get; private set; } = null!;

        /// <summary>
        /// The point in time when the recurrence ends. Example: `23:30`. The end time must be on the hour or on the half hour, and at least 30 minutes later than the start time.
        /// &gt; **NOTE:** If `repeat_type` is set to `Daily`, `Weekly`, or `Monthly`, `repeat_start_time` and `repeat_end_time` must be set.
        /// </summary>
        [Output("repeatEndTime")]
        public Output<string?> RepeatEndTime { get; private set; } = null!;

        /// <summary>
        /// The point in time when the recurrence starts. Example: `08:00`. The start time must be on the hour or on the half hour, and at least 30 minutes earlier than the end time.
        /// </summary>
        [Output("repeatStartTime")]
        public Output<string?> RepeatStartTime { get; private set; } = null!;

        /// <summary>
        /// The recurrence type for the access control policy to take effect. Default value: `Permanent`. Valid values:
        /// - `Permanent`: The policy always takes effect.
        /// - `None`: The policy takes effect for only once.
        /// - `Daily`: The policy takes effect on a daily basis.
        /// - `Weekly`: The policy takes effect on a weekly basis.
        /// - `Monthly`: The policy takes effect on a monthly basis.
        /// </summary>
        [Output("repeatType")]
        public Output<string> RepeatType { get; private set; } = null!;

        /// <summary>
        /// The source address in the access control policy.
        /// </summary>
        [Output("source")]
        public Output<string> Source { get; private set; } = null!;

        /// <summary>
        /// The source IP address of the request.
        /// </summary>
        [Output("sourceIp")]
        public Output<string?> SourceIp { get; private set; } = null!;

        /// <summary>
        /// The type of the source address in the access control policy. Valid values: `net`, `group`, `location`.
        /// </summary>
        [Output("sourceType")]
        public Output<string> SourceType { get; private set; } = null!;

        /// <summary>
        /// The time when the access control policy starts to take effect. The value is a UNIX timestamp. Unit: seconds. The value must be on the hour or on the half hour, and at least 30 minutes earlier than the end time.
        /// </summary>
        [Output("startTime")]
        public Output<int?> StartTime { get; private set; } = null!;


        /// <summary>
        /// Create a ControlPolicy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ControlPolicy(string name, ControlPolicyArgs args, CustomResourceOptions? options = null)
            : base("alicloud:cloudfirewall/controlPolicy:ControlPolicy", name, args ?? new ControlPolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ControlPolicy(string name, Input<string> id, ControlPolicyState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:cloudfirewall/controlPolicy:ControlPolicy", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ControlPolicy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ControlPolicy Get(string name, Input<string> id, ControlPolicyState? state = null, CustomResourceOptions? options = null)
        {
            return new ControlPolicy(name, id, state, options);
        }
    }

    public sealed class ControlPolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The action that Cloud Firewall performs on the traffic. Valid values: `accept`, `drop`, `log`.
        /// </summary>
        [Input("aclAction", required: true)]
        public Input<string> AclAction { get; set; } = null!;

        /// <summary>
        /// The application type supported by the access control policy. Valid values: `ANY`, `HTTP`, `HTTPS`, `MQTT`, `Memcache`, `MongoDB`, `MySQL`, `RDP`, `Redis`, `SMTP`, `SMTPS`, `SSH`, `SSL`, `VNC`.
        /// &gt; **NOTE:** If `proto` is set to `TCP`, you can set `application_name` to any valid value. If `proto` is set to `UDP`, `ICMP`, or `ANY`, you can only set `application_name` to `ANY`.
        /// </summary>
        [Input("applicationName")]
        public Input<string>? ApplicationName { get; set; }

        [Input("applicationNameLists")]
        private InputList<string>? _applicationNameLists;

        /// <summary>
        /// The application types supported by the access control policy.
        /// &gt; **NOTE:** If `proto` is set to `TCP`, you can set `application_name_list` to any valid value. If `proto` is set to `UDP`, `ICMP`, or `ANY`, you can only set `application_name_list` to `["ANY"]`. From version 1.232.0, You must specify at least one of the `application_name_list` and `application_name`. If you specify both `application_name_list` and `application_name`, only the `application_name_list` takes effect.
        /// </summary>
        public InputList<string> ApplicationNameLists
        {
            get => _applicationNameLists ?? (_applicationNameLists = new InputList<string>());
            set => _applicationNameLists = value;
        }

        /// <summary>
        /// The description of the access control policy.
        /// </summary>
        [Input("description", required: true)]
        public Input<string> Description { get; set; } = null!;

        /// <summary>
        /// The destination port in the access control policy. **Note:** If `dest_port_type` is set to `port`, you must specify `dest_port`.
        /// </summary>
        [Input("destPort")]
        public Input<string>? DestPort { get; set; }

        /// <summary>
        /// The name of the destination port address book in the access control policy. **Note:** If `dest_port_type` is set to `group`, you must specify `dest_port_group`.
        /// </summary>
        [Input("destPortGroup")]
        public Input<string>? DestPortGroup { get; set; }

        /// <summary>
        /// The type of the destination port in the access control policy. Valid values: `port`, `group`.
        /// </summary>
        [Input("destPortType")]
        public Input<string>? DestPortType { get; set; }

        /// <summary>
        /// The destination address in the access control policy.
        /// </summary>
        [Input("destination", required: true)]
        public Input<string> Destination { get; set; } = null!;

        /// <summary>
        /// The type of the destination address in the access control policy. Valid values: `net`, `group`, `domain`, `location`.
        /// </summary>
        [Input("destinationType", required: true)]
        public Input<string> DestinationType { get; set; } = null!;

        /// <summary>
        /// The direction of the traffic to which the access control policy applies. Valid values: `in`, `out`.
        /// </summary>
        [Input("direction", required: true)]
        public Input<string> Direction { get; set; } = null!;

        /// <summary>
        /// The domain name resolution method of the access control policy. Valid values:
        /// - `FQDN`: Fully qualified domain name (FQDN)-based resolution.
        /// - `DNS`: DNS-based dynamic resolution.
        /// - `FQDN_AND_DNS`: FQDN and DNS-based dynamic resolution.
        /// </summary>
        [Input("domainResolveType")]
        public Input<string>? DomainResolveType { get; set; }

        /// <summary>
        /// The time when the access control policy stops taking effect. The value is a UNIX timestamp. Unit: seconds. The value must be on the hour or on the half hour, and at least 30 minutes later than the start time.
        /// &gt; **NOTE:** If `repeat_type` is set to `None`, `Daily`, `Weekly`, or `Monthly`, `start_time` and `end_time` must be set.
        /// </summary>
        [Input("endTime")]
        public Input<int>? EndTime { get; set; }

        /// <summary>
        /// The IP version supported by the access control policy. Default value: `4`. Valid values:
        /// </summary>
        [Input("ipVersion")]
        public Input<string>? IpVersion { get; set; }

        /// <summary>
        /// The language of the content within the request and response. Valid values: `zh`, `en`.
        /// </summary>
        [Input("lang")]
        public Input<string>? Lang { get; set; }

        /// <summary>
        /// The protocol type supported by the access control policy. Valid values: `ANY`, ` TCP`, `UDP`, `ICMP`.
        /// </summary>
        [Input("proto", required: true)]
        public Input<string> Proto { get; set; } = null!;

        /// <summary>
        /// The status of the access control policy. Valid values: `true`, `false`.
        /// </summary>
        [Input("release")]
        public Input<string>? Release { get; set; }

        [Input("repeatDays")]
        private InputList<int>? _repeatDays;

        /// <summary>
        /// The days of a week or of a month on which the access control policy takes effect. Valid values:
        /// - If `repeat_type` is set to `Weekly`. Valid values: `0` to `6`.
        /// - If `repeat_type` is set to `Monthly`. Valid values: `1` to `31`.
        /// &gt; **NOTE:** If `repeat_type` is set to `Weekly`, or `Monthly`, `repeat_days` must be set.
        /// </summary>
        public InputList<int> RepeatDays
        {
            get => _repeatDays ?? (_repeatDays = new InputList<int>());
            set => _repeatDays = value;
        }

        /// <summary>
        /// The point in time when the recurrence ends. Example: `23:30`. The end time must be on the hour or on the half hour, and at least 30 minutes later than the start time.
        /// &gt; **NOTE:** If `repeat_type` is set to `Daily`, `Weekly`, or `Monthly`, `repeat_start_time` and `repeat_end_time` must be set.
        /// </summary>
        [Input("repeatEndTime")]
        public Input<string>? RepeatEndTime { get; set; }

        /// <summary>
        /// The point in time when the recurrence starts. Example: `08:00`. The start time must be on the hour or on the half hour, and at least 30 minutes earlier than the end time.
        /// </summary>
        [Input("repeatStartTime")]
        public Input<string>? RepeatStartTime { get; set; }

        /// <summary>
        /// The recurrence type for the access control policy to take effect. Default value: `Permanent`. Valid values:
        /// - `Permanent`: The policy always takes effect.
        /// - `None`: The policy takes effect for only once.
        /// - `Daily`: The policy takes effect on a daily basis.
        /// - `Weekly`: The policy takes effect on a weekly basis.
        /// - `Monthly`: The policy takes effect on a monthly basis.
        /// </summary>
        [Input("repeatType")]
        public Input<string>? RepeatType { get; set; }

        /// <summary>
        /// The source address in the access control policy.
        /// </summary>
        [Input("source", required: true)]
        public Input<string> Source { get; set; } = null!;

        /// <summary>
        /// The source IP address of the request.
        /// </summary>
        [Input("sourceIp")]
        public Input<string>? SourceIp { get; set; }

        /// <summary>
        /// The type of the source address in the access control policy. Valid values: `net`, `group`, `location`.
        /// </summary>
        [Input("sourceType", required: true)]
        public Input<string> SourceType { get; set; } = null!;

        /// <summary>
        /// The time when the access control policy starts to take effect. The value is a UNIX timestamp. Unit: seconds. The value must be on the hour or on the half hour, and at least 30 minutes earlier than the end time.
        /// </summary>
        [Input("startTime")]
        public Input<int>? StartTime { get; set; }

        public ControlPolicyArgs()
        {
        }
        public static new ControlPolicyArgs Empty => new ControlPolicyArgs();
    }

    public sealed class ControlPolicyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The action that Cloud Firewall performs on the traffic. Valid values: `accept`, `drop`, `log`.
        /// </summary>
        [Input("aclAction")]
        public Input<string>? AclAction { get; set; }

        /// <summary>
        /// (Available since v1.148.0) The unique ID of the access control policy.
        /// </summary>
        [Input("aclUuid")]
        public Input<string>? AclUuid { get; set; }

        /// <summary>
        /// The application type supported by the access control policy. Valid values: `ANY`, `HTTP`, `HTTPS`, `MQTT`, `Memcache`, `MongoDB`, `MySQL`, `RDP`, `Redis`, `SMTP`, `SMTPS`, `SSH`, `SSL`, `VNC`.
        /// &gt; **NOTE:** If `proto` is set to `TCP`, you can set `application_name` to any valid value. If `proto` is set to `UDP`, `ICMP`, or `ANY`, you can only set `application_name` to `ANY`.
        /// </summary>
        [Input("applicationName")]
        public Input<string>? ApplicationName { get; set; }

        [Input("applicationNameLists")]
        private InputList<string>? _applicationNameLists;

        /// <summary>
        /// The application types supported by the access control policy.
        /// &gt; **NOTE:** If `proto` is set to `TCP`, you can set `application_name_list` to any valid value. If `proto` is set to `UDP`, `ICMP`, or `ANY`, you can only set `application_name_list` to `["ANY"]`. From version 1.232.0, You must specify at least one of the `application_name_list` and `application_name`. If you specify both `application_name_list` and `application_name`, only the `application_name_list` takes effect.
        /// </summary>
        public InputList<string> ApplicationNameLists
        {
            get => _applicationNameLists ?? (_applicationNameLists = new InputList<string>());
            set => _applicationNameLists = value;
        }

        /// <summary>
        /// (Available since v1.232.0) The time when the access control policy was created.
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// The description of the access control policy.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The destination port in the access control policy. **Note:** If `dest_port_type` is set to `port`, you must specify `dest_port`.
        /// </summary>
        [Input("destPort")]
        public Input<string>? DestPort { get; set; }

        /// <summary>
        /// The name of the destination port address book in the access control policy. **Note:** If `dest_port_type` is set to `group`, you must specify `dest_port_group`.
        /// </summary>
        [Input("destPortGroup")]
        public Input<string>? DestPortGroup { get; set; }

        /// <summary>
        /// The type of the destination port in the access control policy. Valid values: `port`, `group`.
        /// </summary>
        [Input("destPortType")]
        public Input<string>? DestPortType { get; set; }

        /// <summary>
        /// The destination address in the access control policy.
        /// </summary>
        [Input("destination")]
        public Input<string>? Destination { get; set; }

        /// <summary>
        /// The type of the destination address in the access control policy. Valid values: `net`, `group`, `domain`, `location`.
        /// </summary>
        [Input("destinationType")]
        public Input<string>? DestinationType { get; set; }

        /// <summary>
        /// The direction of the traffic to which the access control policy applies. Valid values: `in`, `out`.
        /// </summary>
        [Input("direction")]
        public Input<string>? Direction { get; set; }

        /// <summary>
        /// The domain name resolution method of the access control policy. Valid values:
        /// - `FQDN`: Fully qualified domain name (FQDN)-based resolution.
        /// - `DNS`: DNS-based dynamic resolution.
        /// - `FQDN_AND_DNS`: FQDN and DNS-based dynamic resolution.
        /// </summary>
        [Input("domainResolveType")]
        public Input<string>? DomainResolveType { get; set; }

        /// <summary>
        /// The time when the access control policy stops taking effect. The value is a UNIX timestamp. Unit: seconds. The value must be on the hour or on the half hour, and at least 30 minutes later than the start time.
        /// &gt; **NOTE:** If `repeat_type` is set to `None`, `Daily`, `Weekly`, or `Monthly`, `start_time` and `end_time` must be set.
        /// </summary>
        [Input("endTime")]
        public Input<int>? EndTime { get; set; }

        /// <summary>
        /// The IP version supported by the access control policy. Default value: `4`. Valid values:
        /// </summary>
        [Input("ipVersion")]
        public Input<string>? IpVersion { get; set; }

        /// <summary>
        /// The language of the content within the request and response. Valid values: `zh`, `en`.
        /// </summary>
        [Input("lang")]
        public Input<string>? Lang { get; set; }

        /// <summary>
        /// The protocol type supported by the access control policy. Valid values: `ANY`, ` TCP`, `UDP`, `ICMP`.
        /// </summary>
        [Input("proto")]
        public Input<string>? Proto { get; set; }

        /// <summary>
        /// The status of the access control policy. Valid values: `true`, `false`.
        /// </summary>
        [Input("release")]
        public Input<string>? Release { get; set; }

        [Input("repeatDays")]
        private InputList<int>? _repeatDays;

        /// <summary>
        /// The days of a week or of a month on which the access control policy takes effect. Valid values:
        /// - If `repeat_type` is set to `Weekly`. Valid values: `0` to `6`.
        /// - If `repeat_type` is set to `Monthly`. Valid values: `1` to `31`.
        /// &gt; **NOTE:** If `repeat_type` is set to `Weekly`, or `Monthly`, `repeat_days` must be set.
        /// </summary>
        public InputList<int> RepeatDays
        {
            get => _repeatDays ?? (_repeatDays = new InputList<int>());
            set => _repeatDays = value;
        }

        /// <summary>
        /// The point in time when the recurrence ends. Example: `23:30`. The end time must be on the hour or on the half hour, and at least 30 minutes later than the start time.
        /// &gt; **NOTE:** If `repeat_type` is set to `Daily`, `Weekly`, or `Monthly`, `repeat_start_time` and `repeat_end_time` must be set.
        /// </summary>
        [Input("repeatEndTime")]
        public Input<string>? RepeatEndTime { get; set; }

        /// <summary>
        /// The point in time when the recurrence starts. Example: `08:00`. The start time must be on the hour or on the half hour, and at least 30 minutes earlier than the end time.
        /// </summary>
        [Input("repeatStartTime")]
        public Input<string>? RepeatStartTime { get; set; }

        /// <summary>
        /// The recurrence type for the access control policy to take effect. Default value: `Permanent`. Valid values:
        /// - `Permanent`: The policy always takes effect.
        /// - `None`: The policy takes effect for only once.
        /// - `Daily`: The policy takes effect on a daily basis.
        /// - `Weekly`: The policy takes effect on a weekly basis.
        /// - `Monthly`: The policy takes effect on a monthly basis.
        /// </summary>
        [Input("repeatType")]
        public Input<string>? RepeatType { get; set; }

        /// <summary>
        /// The source address in the access control policy.
        /// </summary>
        [Input("source")]
        public Input<string>? Source { get; set; }

        /// <summary>
        /// The source IP address of the request.
        /// </summary>
        [Input("sourceIp")]
        public Input<string>? SourceIp { get; set; }

        /// <summary>
        /// The type of the source address in the access control policy. Valid values: `net`, `group`, `location`.
        /// </summary>
        [Input("sourceType")]
        public Input<string>? SourceType { get; set; }

        /// <summary>
        /// The time when the access control policy starts to take effect. The value is a UNIX timestamp. Unit: seconds. The value must be on the hour or on the half hour, and at least 30 minutes earlier than the end time.
        /// </summary>
        [Input("startTime")]
        public Input<int>? StartTime { get; set; }

        public ControlPolicyState()
        {
        }
        public static new ControlPolicyState Empty => new ControlPolicyState();
    }
}
