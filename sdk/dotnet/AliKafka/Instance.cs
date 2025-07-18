// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.AliKafka
{
    /// <summary>
    /// ## Import
    /// 
    /// AliKafka instance can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:alikafka/instance:Instance example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:alikafka/instance:Instance")]
    public partial class Instance : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The initial configurations of the ApsaraMQ for Kafka instance. The values must be valid JSON strings. The `config` supports the following parameters:
        /// * `enable.vpc_sasl_ssl`: Specifies whether to enable VPC transmission encryption. Default value: `false`. Valid values:
        /// </summary>
        [Output("config")]
        public Output<string> Config { get; private set; } = null!;

        /// <summary>
        /// The configurations of Confluent. See `confluent_config` below.
        /// &gt; **NOTE:** If `instance_type` is set to `alikafka_confluent`, `confluent_config` is required.
        /// </summary>
        [Output("confluentConfig")]
        public Output<Outputs.InstanceConfluentConfig> ConfluentConfig { get; private set; } = null!;

        /// <summary>
        /// The number of partitions in a topic that is automatically created.
        /// </summary>
        [Output("defaultTopicPartitionNum")]
        public Output<int> DefaultTopicPartitionNum { get; private set; } = null!;

        /// <summary>
        /// The deployment type of the instance. **NOTE:** From version 1.161.0, this attribute supports to be updated. Valid values:
        /// </summary>
        [Output("deployType")]
        public Output<int> DeployType { get; private set; } = null!;

        /// <summary>
        /// The disk size of the instance. When modify this value, it only supports adjust to a greater value.
        /// &gt; **NOTE:** If `instance_type` is set to `alikafka`, `disk_size` is required.
        /// </summary>
        [Output("diskSize")]
        public Output<int?> DiskSize { get; private set; } = null!;

        /// <summary>
        /// The disk type of the instance. Valid values:
        /// </summary>
        [Output("diskType")]
        public Output<int?> DiskType { get; private set; } = null!;

        /// <summary>
        /// (Available since v1.234.0) The default endpoint of the instance in domain name mode.
        /// </summary>
        [Output("domainEndpoint")]
        public Output<string> DomainEndpoint { get; private set; } = null!;

        /// <summary>
        /// The max bandwidth of the instance. It will be ignored when `deploy_type = 5`. When modify this value, it only supports adjust to a greater value.
        /// </summary>
        [Output("eipMax")]
        public Output<int> EipMax { get; private set; } = null!;

        /// <summary>
        /// Specify whether to enable the flexible group creation feature. Default value: `false`. Valid values:
        /// </summary>
        [Output("enableAutoGroup")]
        public Output<bool?> EnableAutoGroup { get; private set; } = null!;

        /// <summary>
        /// Specify whether to enable the automatic topic creation feature. Default value: `disable`. Valid values:
        /// </summary>
        [Output("enableAutoTopic")]
        public Output<string> EnableAutoTopic { get; private set; } = null!;

        /// <summary>
        /// The EndPoint to access the kafka instance.
        /// </summary>
        [Output("endPoint")]
        public Output<string> EndPoint { get; private set; } = null!;

        /// <summary>
        /// (Available since v1.214.1) The number of available groups.
        /// </summary>
        [Output("groupLeft")]
        public Output<int> GroupLeft { get; private set; } = null!;

        /// <summary>
        /// (Available since v1.214.1) The number of used groups.
        /// </summary>
        [Output("groupUsed")]
        public Output<int> GroupUsed { get; private set; } = null!;

        /// <summary>
        /// The type of the Instance. Default value: `alikafka`. Valid values:
        /// </summary>
        [Output("instanceType")]
        public Output<string> InstanceType { get; private set; } = null!;

        /// <summary>
        /// The max value of io of the instance. When modify this value, it only support adjust to a greater value.
        /// </summary>
        [Output("ioMax")]
        public Output<int> IoMax { get; private set; } = null!;

        /// <summary>
        /// The traffic specification of the instance. We recommend that you configure this parameter.
        /// - You should specify one of the `io_max` and `io_max_spec` parameters, and `io_max_spec` is recommended.
        /// - For more information about the valid values, see [Billing](https://www.alibabacloud.com/help/en/message-queue-for-apache-kafka/latest/billing-overview).
        /// </summary>
        [Output("ioMaxSpec")]
        public Output<string> IoMaxSpec { get; private set; } = null!;

        /// <summary>
        /// (Available since v1.214.1) The method that you use to purchase partitions.
        /// </summary>
        [Output("isPartitionBuy")]
        public Output<int> IsPartitionBuy { get; private set; } = null!;

        /// <summary>
        /// The ID of the key that is used to encrypt data on standard SSDs in the region of the instance.
        /// </summary>
        [Output("kmsKeyId")]
        public Output<string?> KmsKeyId { get; private set; } = null!;

        /// <summary>
        /// Name of your Kafka instance. The length should between 3 and 64 characters. If not set, will use instance id as instance name.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The billing method of the instance. Default value: `PostPaid`. Valid values: `PostPaid`, `PrePaid`. When modify this value, it only support adjust from `PostPaid` to `PrePaid`.
        /// </summary>
        [Output("paidType")]
        public Output<string?> PaidType { get; private set; } = null!;

        /// <summary>
        /// (Available since v1.214.1) The number of available partitions.
        /// </summary>
        [Output("partitionLeft")]
        public Output<int> PartitionLeft { get; private set; } = null!;

        /// <summary>
        /// The number of partitions.
        /// </summary>
        [Output("partitionNum")]
        public Output<int?> PartitionNum { get; private set; } = null!;

        /// <summary>
        /// (Available since v1.214.1) The number of used partitions.
        /// </summary>
        [Output("partitionUsed")]
        public Output<int> PartitionUsed { get; private set; } = null!;

        /// <summary>
        /// The instance password. **NOTE:** If `instance_type` is set to `alikafka_confluent`, `password` is required.
        /// </summary>
        [Output("password")]
        public Output<string?> Password { get; private set; } = null!;

        /// <summary>
        /// The ID of the resource group. **Note:** Once you set a value of this property, you cannot set it to an empty string anymore.
        /// </summary>
        [Output("resourceGroupId")]
        public Output<string> ResourceGroupId { get; private set; } = null!;

        /// <summary>
        /// (Available since v1.234.0) The Simple Authentication and Security Layer (SASL) endpoint of the instance in domain name mode.
        /// </summary>
        [Output("saslDomainEndpoint")]
        public Output<string> SaslDomainEndpoint { get; private set; } = null!;

        /// <summary>
        /// The ID of security group for this instance. If the security group is empty, system will create a default one.
        /// </summary>
        [Output("securityGroup")]
        public Output<string> SecurityGroup { get; private set; } = null!;

        /// <summary>
        /// The zones among which you want to deploy the instance.
        /// </summary>
        [Output("selectedZones")]
        public Output<ImmutableArray<string>> SelectedZones { get; private set; } = null!;

        /// <summary>
        /// The parameters configured for the serverless ApsaraMQ for Kafka instance. See `serverless_config` below.
        /// &gt; **NOTE:** If `instance_type` is set to `alikafka_serverless`, `serverless_config` is required.
        /// </summary>
        [Output("serverlessConfig")]
        public Output<Outputs.InstanceServerlessConfig> ServerlessConfig { get; private set; } = null!;

        /// <summary>
        /// The version of the Instance. Valid values:
        /// - If `instance_type` is set to `alikafka`. Default value: `2.2.0`. Valid values: `2.2.0`, `2.6.2`.
        /// - If `instance_type` is set to `alikafka_serverless`. Default value: `3.3.1`. Valid values: `3.3.1`.
        /// - If `instance_type` is set to `alikafka_confluent`. Default value: `7.4.0`. Valid values: `7.4.0`.
        /// </summary>
        [Output("serviceVersion")]
        public Output<string> ServiceVersion { get; private set; } = null!;

        /// <summary>
        /// The instance edition. Default value: `normal`. Valid values:
        /// - If `instance_type` is set to `alikafka`. Valid values: `normal`, `professional`, `professionalForHighRead`.
        /// - If `instance_type` is set to `alikafka_serverless`. Valid values: `normal`.
        /// - If `instance_type` is set to `alikafka_confluent`. Valid values: `professional`, `enterprise`.
        /// </summary>
        [Output("specType")]
        public Output<string?> SpecType { get; private set; } = null!;

        /// <summary>
        /// (Available since v1.234.0) The SSL endpoint of the instance in domain name mode.
        /// </summary>
        [Output("sslDomainEndpoint")]
        public Output<string> SslDomainEndpoint { get; private set; } = null!;

        /// <summary>
        /// (Available since v1.234.0) The Secure Sockets Layer (SSL) endpoint of the instance in IP address mode.
        /// </summary>
        [Output("sslEndpoint")]
        public Output<string> SslEndpoint { get; private set; } = null!;

        /// <summary>
        /// The status of the instance.
        /// </summary>
        [Output("status")]
        public Output<int> Status { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// (Available since v1.214.1) The number of available topics.
        /// </summary>
        [Output("topicLeft")]
        public Output<int> TopicLeft { get; private set; } = null!;

        /// <summary>
        /// (Available since v1.214.1) The number of purchased topics.
        /// </summary>
        [Output("topicNumOfBuy")]
        public Output<int> TopicNumOfBuy { get; private set; } = null!;

        /// <summary>
        /// The max num of topic can be creation of the instance.
        /// It has been deprecated since version 1.194.0 and using `partition_num` instead.
        /// Currently, its value only can be set to 50 when creating it, and finally depends on `partition_num` value: &lt;`topic_quota`&gt; = 1000 + &lt;`partition_num`&gt;.
        /// Therefore, you can update it by updating the `partition_num`, and it is the only updating path.
        /// </summary>
        [Output("topicQuota")]
        public Output<int> TopicQuota { get; private set; } = null!;

        /// <summary>
        /// (Available since v1.214.1) The number of used topics.
        /// </summary>
        [Output("topicUsed")]
        public Output<int> TopicUsed { get; private set; } = null!;

        /// <summary>
        /// The VPC ID of the instance.
        /// </summary>
        [Output("vpcId")]
        public Output<string> VpcId { get; private set; } = null!;

        /// <summary>
        /// The ID of attaching vswitch to instance.
        /// </summary>
        [Output("vswitchId")]
        public Output<string> VswitchId { get; private set; } = null!;

        /// <summary>
        /// The IDs of the vSwitches with which the instance is associated.
        /// </summary>
        [Output("vswitchIds")]
        public Output<ImmutableArray<string>> VswitchIds { get; private set; } = null!;

        /// <summary>
        /// The zone ID of the instance. The value can be in zone x or region id-x format. **NOTE**: When the available zone is insufficient, another availability zone may be deployed.
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a Instance resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Instance(string name, InstanceArgs args, CustomResourceOptions? options = null)
            : base("alicloud:alikafka/instance:Instance", name, args ?? new InstanceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Instance(string name, Input<string> id, InstanceState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:alikafka/instance:Instance", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Instance resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Instance Get(string name, Input<string> id, InstanceState? state = null, CustomResourceOptions? options = null)
        {
            return new Instance(name, id, state, options);
        }
    }

    public sealed class InstanceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The initial configurations of the ApsaraMQ for Kafka instance. The values must be valid JSON strings. The `config` supports the following parameters:
        /// * `enable.vpc_sasl_ssl`: Specifies whether to enable VPC transmission encryption. Default value: `false`. Valid values:
        /// </summary>
        [Input("config")]
        public Input<string>? Config { get; set; }

        /// <summary>
        /// The configurations of Confluent. See `confluent_config` below.
        /// &gt; **NOTE:** If `instance_type` is set to `alikafka_confluent`, `confluent_config` is required.
        /// </summary>
        [Input("confluentConfig")]
        public Input<Inputs.InstanceConfluentConfigArgs>? ConfluentConfig { get; set; }

        /// <summary>
        /// The number of partitions in a topic that is automatically created.
        /// </summary>
        [Input("defaultTopicPartitionNum")]
        public Input<int>? DefaultTopicPartitionNum { get; set; }

        /// <summary>
        /// The deployment type of the instance. **NOTE:** From version 1.161.0, this attribute supports to be updated. Valid values:
        /// </summary>
        [Input("deployType", required: true)]
        public Input<int> DeployType { get; set; } = null!;

        /// <summary>
        /// The disk size of the instance. When modify this value, it only supports adjust to a greater value.
        /// &gt; **NOTE:** If `instance_type` is set to `alikafka`, `disk_size` is required.
        /// </summary>
        [Input("diskSize")]
        public Input<int>? DiskSize { get; set; }

        /// <summary>
        /// The disk type of the instance. Valid values:
        /// </summary>
        [Input("diskType")]
        public Input<int>? DiskType { get; set; }

        /// <summary>
        /// The max bandwidth of the instance. It will be ignored when `deploy_type = 5`. When modify this value, it only supports adjust to a greater value.
        /// </summary>
        [Input("eipMax")]
        public Input<int>? EipMax { get; set; }

        /// <summary>
        /// Specify whether to enable the flexible group creation feature. Default value: `false`. Valid values:
        /// </summary>
        [Input("enableAutoGroup")]
        public Input<bool>? EnableAutoGroup { get; set; }

        /// <summary>
        /// Specify whether to enable the automatic topic creation feature. Default value: `disable`. Valid values:
        /// </summary>
        [Input("enableAutoTopic")]
        public Input<string>? EnableAutoTopic { get; set; }

        /// <summary>
        /// The type of the Instance. Default value: `alikafka`. Valid values:
        /// </summary>
        [Input("instanceType")]
        public Input<string>? InstanceType { get; set; }

        /// <summary>
        /// The max value of io of the instance. When modify this value, it only support adjust to a greater value.
        /// </summary>
        [Input("ioMax")]
        public Input<int>? IoMax { get; set; }

        /// <summary>
        /// The traffic specification of the instance. We recommend that you configure this parameter.
        /// - You should specify one of the `io_max` and `io_max_spec` parameters, and `io_max_spec` is recommended.
        /// - For more information about the valid values, see [Billing](https://www.alibabacloud.com/help/en/message-queue-for-apache-kafka/latest/billing-overview).
        /// </summary>
        [Input("ioMaxSpec")]
        public Input<string>? IoMaxSpec { get; set; }

        /// <summary>
        /// The ID of the key that is used to encrypt data on standard SSDs in the region of the instance.
        /// </summary>
        [Input("kmsKeyId")]
        public Input<string>? KmsKeyId { get; set; }

        /// <summary>
        /// Name of your Kafka instance. The length should between 3 and 64 characters. If not set, will use instance id as instance name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The billing method of the instance. Default value: `PostPaid`. Valid values: `PostPaid`, `PrePaid`. When modify this value, it only support adjust from `PostPaid` to `PrePaid`.
        /// </summary>
        [Input("paidType")]
        public Input<string>? PaidType { get; set; }

        /// <summary>
        /// The number of partitions.
        /// </summary>
        [Input("partitionNum")]
        public Input<int>? PartitionNum { get; set; }

        /// <summary>
        /// The instance password. **NOTE:** If `instance_type` is set to `alikafka_confluent`, `password` is required.
        /// </summary>
        [Input("password")]
        public Input<string>? Password { get; set; }

        /// <summary>
        /// The ID of the resource group. **Note:** Once you set a value of this property, you cannot set it to an empty string anymore.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// The ID of security group for this instance. If the security group is empty, system will create a default one.
        /// </summary>
        [Input("securityGroup")]
        public Input<string>? SecurityGroup { get; set; }

        [Input("selectedZones")]
        private InputList<string>? _selectedZones;

        /// <summary>
        /// The zones among which you want to deploy the instance.
        /// </summary>
        public InputList<string> SelectedZones
        {
            get => _selectedZones ?? (_selectedZones = new InputList<string>());
            set => _selectedZones = value;
        }

        /// <summary>
        /// The parameters configured for the serverless ApsaraMQ for Kafka instance. See `serverless_config` below.
        /// &gt; **NOTE:** If `instance_type` is set to `alikafka_serverless`, `serverless_config` is required.
        /// </summary>
        [Input("serverlessConfig")]
        public Input<Inputs.InstanceServerlessConfigArgs>? ServerlessConfig { get; set; }

        /// <summary>
        /// The version of the Instance. Valid values:
        /// - If `instance_type` is set to `alikafka`. Default value: `2.2.0`. Valid values: `2.2.0`, `2.6.2`.
        /// - If `instance_type` is set to `alikafka_serverless`. Default value: `3.3.1`. Valid values: `3.3.1`.
        /// - If `instance_type` is set to `alikafka_confluent`. Default value: `7.4.0`. Valid values: `7.4.0`.
        /// </summary>
        [Input("serviceVersion")]
        public Input<string>? ServiceVersion { get; set; }

        /// <summary>
        /// The instance edition. Default value: `normal`. Valid values:
        /// - If `instance_type` is set to `alikafka`. Valid values: `normal`, `professional`, `professionalForHighRead`.
        /// - If `instance_type` is set to `alikafka_serverless`. Valid values: `normal`.
        /// - If `instance_type` is set to `alikafka_confluent`. Valid values: `professional`, `enterprise`.
        /// </summary>
        [Input("specType")]
        public Input<string>? SpecType { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The max num of topic can be creation of the instance.
        /// It has been deprecated since version 1.194.0 and using `partition_num` instead.
        /// Currently, its value only can be set to 50 when creating it, and finally depends on `partition_num` value: &lt;`topic_quota`&gt; = 1000 + &lt;`partition_num`&gt;.
        /// Therefore, you can update it by updating the `partition_num`, and it is the only updating path.
        /// </summary>
        [Input("topicQuota")]
        public Input<int>? TopicQuota { get; set; }

        /// <summary>
        /// The VPC ID of the instance.
        /// </summary>
        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        /// <summary>
        /// The ID of attaching vswitch to instance.
        /// </summary>
        [Input("vswitchId")]
        public Input<string>? VswitchId { get; set; }

        [Input("vswitchIds")]
        private InputList<string>? _vswitchIds;

        /// <summary>
        /// The IDs of the vSwitches with which the instance is associated.
        /// </summary>
        public InputList<string> VswitchIds
        {
            get => _vswitchIds ?? (_vswitchIds = new InputList<string>());
            set => _vswitchIds = value;
        }

        /// <summary>
        /// The zone ID of the instance. The value can be in zone x or region id-x format. **NOTE**: When the available zone is insufficient, another availability zone may be deployed.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public InstanceArgs()
        {
        }
        public static new InstanceArgs Empty => new InstanceArgs();
    }

    public sealed class InstanceState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The initial configurations of the ApsaraMQ for Kafka instance. The values must be valid JSON strings. The `config` supports the following parameters:
        /// * `enable.vpc_sasl_ssl`: Specifies whether to enable VPC transmission encryption. Default value: `false`. Valid values:
        /// </summary>
        [Input("config")]
        public Input<string>? Config { get; set; }

        /// <summary>
        /// The configurations of Confluent. See `confluent_config` below.
        /// &gt; **NOTE:** If `instance_type` is set to `alikafka_confluent`, `confluent_config` is required.
        /// </summary>
        [Input("confluentConfig")]
        public Input<Inputs.InstanceConfluentConfigGetArgs>? ConfluentConfig { get; set; }

        /// <summary>
        /// The number of partitions in a topic that is automatically created.
        /// </summary>
        [Input("defaultTopicPartitionNum")]
        public Input<int>? DefaultTopicPartitionNum { get; set; }

        /// <summary>
        /// The deployment type of the instance. **NOTE:** From version 1.161.0, this attribute supports to be updated. Valid values:
        /// </summary>
        [Input("deployType")]
        public Input<int>? DeployType { get; set; }

        /// <summary>
        /// The disk size of the instance. When modify this value, it only supports adjust to a greater value.
        /// &gt; **NOTE:** If `instance_type` is set to `alikafka`, `disk_size` is required.
        /// </summary>
        [Input("diskSize")]
        public Input<int>? DiskSize { get; set; }

        /// <summary>
        /// The disk type of the instance. Valid values:
        /// </summary>
        [Input("diskType")]
        public Input<int>? DiskType { get; set; }

        /// <summary>
        /// (Available since v1.234.0) The default endpoint of the instance in domain name mode.
        /// </summary>
        [Input("domainEndpoint")]
        public Input<string>? DomainEndpoint { get; set; }

        /// <summary>
        /// The max bandwidth of the instance. It will be ignored when `deploy_type = 5`. When modify this value, it only supports adjust to a greater value.
        /// </summary>
        [Input("eipMax")]
        public Input<int>? EipMax { get; set; }

        /// <summary>
        /// Specify whether to enable the flexible group creation feature. Default value: `false`. Valid values:
        /// </summary>
        [Input("enableAutoGroup")]
        public Input<bool>? EnableAutoGroup { get; set; }

        /// <summary>
        /// Specify whether to enable the automatic topic creation feature. Default value: `disable`. Valid values:
        /// </summary>
        [Input("enableAutoTopic")]
        public Input<string>? EnableAutoTopic { get; set; }

        /// <summary>
        /// The EndPoint to access the kafka instance.
        /// </summary>
        [Input("endPoint")]
        public Input<string>? EndPoint { get; set; }

        /// <summary>
        /// (Available since v1.214.1) The number of available groups.
        /// </summary>
        [Input("groupLeft")]
        public Input<int>? GroupLeft { get; set; }

        /// <summary>
        /// (Available since v1.214.1) The number of used groups.
        /// </summary>
        [Input("groupUsed")]
        public Input<int>? GroupUsed { get; set; }

        /// <summary>
        /// The type of the Instance. Default value: `alikafka`. Valid values:
        /// </summary>
        [Input("instanceType")]
        public Input<string>? InstanceType { get; set; }

        /// <summary>
        /// The max value of io of the instance. When modify this value, it only support adjust to a greater value.
        /// </summary>
        [Input("ioMax")]
        public Input<int>? IoMax { get; set; }

        /// <summary>
        /// The traffic specification of the instance. We recommend that you configure this parameter.
        /// - You should specify one of the `io_max` and `io_max_spec` parameters, and `io_max_spec` is recommended.
        /// - For more information about the valid values, see [Billing](https://www.alibabacloud.com/help/en/message-queue-for-apache-kafka/latest/billing-overview).
        /// </summary>
        [Input("ioMaxSpec")]
        public Input<string>? IoMaxSpec { get; set; }

        /// <summary>
        /// (Available since v1.214.1) The method that you use to purchase partitions.
        /// </summary>
        [Input("isPartitionBuy")]
        public Input<int>? IsPartitionBuy { get; set; }

        /// <summary>
        /// The ID of the key that is used to encrypt data on standard SSDs in the region of the instance.
        /// </summary>
        [Input("kmsKeyId")]
        public Input<string>? KmsKeyId { get; set; }

        /// <summary>
        /// Name of your Kafka instance. The length should between 3 and 64 characters. If not set, will use instance id as instance name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The billing method of the instance. Default value: `PostPaid`. Valid values: `PostPaid`, `PrePaid`. When modify this value, it only support adjust from `PostPaid` to `PrePaid`.
        /// </summary>
        [Input("paidType")]
        public Input<string>? PaidType { get; set; }

        /// <summary>
        /// (Available since v1.214.1) The number of available partitions.
        /// </summary>
        [Input("partitionLeft")]
        public Input<int>? PartitionLeft { get; set; }

        /// <summary>
        /// The number of partitions.
        /// </summary>
        [Input("partitionNum")]
        public Input<int>? PartitionNum { get; set; }

        /// <summary>
        /// (Available since v1.214.1) The number of used partitions.
        /// </summary>
        [Input("partitionUsed")]
        public Input<int>? PartitionUsed { get; set; }

        /// <summary>
        /// The instance password. **NOTE:** If `instance_type` is set to `alikafka_confluent`, `password` is required.
        /// </summary>
        [Input("password")]
        public Input<string>? Password { get; set; }

        /// <summary>
        /// The ID of the resource group. **Note:** Once you set a value of this property, you cannot set it to an empty string anymore.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// (Available since v1.234.0) The Simple Authentication and Security Layer (SASL) endpoint of the instance in domain name mode.
        /// </summary>
        [Input("saslDomainEndpoint")]
        public Input<string>? SaslDomainEndpoint { get; set; }

        /// <summary>
        /// The ID of security group for this instance. If the security group is empty, system will create a default one.
        /// </summary>
        [Input("securityGroup")]
        public Input<string>? SecurityGroup { get; set; }

        [Input("selectedZones")]
        private InputList<string>? _selectedZones;

        /// <summary>
        /// The zones among which you want to deploy the instance.
        /// </summary>
        public InputList<string> SelectedZones
        {
            get => _selectedZones ?? (_selectedZones = new InputList<string>());
            set => _selectedZones = value;
        }

        /// <summary>
        /// The parameters configured for the serverless ApsaraMQ for Kafka instance. See `serverless_config` below.
        /// &gt; **NOTE:** If `instance_type` is set to `alikafka_serverless`, `serverless_config` is required.
        /// </summary>
        [Input("serverlessConfig")]
        public Input<Inputs.InstanceServerlessConfigGetArgs>? ServerlessConfig { get; set; }

        /// <summary>
        /// The version of the Instance. Valid values:
        /// - If `instance_type` is set to `alikafka`. Default value: `2.2.0`. Valid values: `2.2.0`, `2.6.2`.
        /// - If `instance_type` is set to `alikafka_serverless`. Default value: `3.3.1`. Valid values: `3.3.1`.
        /// - If `instance_type` is set to `alikafka_confluent`. Default value: `7.4.0`. Valid values: `7.4.0`.
        /// </summary>
        [Input("serviceVersion")]
        public Input<string>? ServiceVersion { get; set; }

        /// <summary>
        /// The instance edition. Default value: `normal`. Valid values:
        /// - If `instance_type` is set to `alikafka`. Valid values: `normal`, `professional`, `professionalForHighRead`.
        /// - If `instance_type` is set to `alikafka_serverless`. Valid values: `normal`.
        /// - If `instance_type` is set to `alikafka_confluent`. Valid values: `professional`, `enterprise`.
        /// </summary>
        [Input("specType")]
        public Input<string>? SpecType { get; set; }

        /// <summary>
        /// (Available since v1.234.0) The SSL endpoint of the instance in domain name mode.
        /// </summary>
        [Input("sslDomainEndpoint")]
        public Input<string>? SslDomainEndpoint { get; set; }

        /// <summary>
        /// (Available since v1.234.0) The Secure Sockets Layer (SSL) endpoint of the instance in IP address mode.
        /// </summary>
        [Input("sslEndpoint")]
        public Input<string>? SslEndpoint { get; set; }

        /// <summary>
        /// The status of the instance.
        /// </summary>
        [Input("status")]
        public Input<int>? Status { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// (Available since v1.214.1) The number of available topics.
        /// </summary>
        [Input("topicLeft")]
        public Input<int>? TopicLeft { get; set; }

        /// <summary>
        /// (Available since v1.214.1) The number of purchased topics.
        /// </summary>
        [Input("topicNumOfBuy")]
        public Input<int>? TopicNumOfBuy { get; set; }

        /// <summary>
        /// The max num of topic can be creation of the instance.
        /// It has been deprecated since version 1.194.0 and using `partition_num` instead.
        /// Currently, its value only can be set to 50 when creating it, and finally depends on `partition_num` value: &lt;`topic_quota`&gt; = 1000 + &lt;`partition_num`&gt;.
        /// Therefore, you can update it by updating the `partition_num`, and it is the only updating path.
        /// </summary>
        [Input("topicQuota")]
        public Input<int>? TopicQuota { get; set; }

        /// <summary>
        /// (Available since v1.214.1) The number of used topics.
        /// </summary>
        [Input("topicUsed")]
        public Input<int>? TopicUsed { get; set; }

        /// <summary>
        /// The VPC ID of the instance.
        /// </summary>
        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        /// <summary>
        /// The ID of attaching vswitch to instance.
        /// </summary>
        [Input("vswitchId")]
        public Input<string>? VswitchId { get; set; }

        [Input("vswitchIds")]
        private InputList<string>? _vswitchIds;

        /// <summary>
        /// The IDs of the vSwitches with which the instance is associated.
        /// </summary>
        public InputList<string> VswitchIds
        {
            get => _vswitchIds ?? (_vswitchIds = new InputList<string>());
            set => _vswitchIds = value;
        }

        /// <summary>
        /// The zone ID of the instance. The value can be in zone x or region id-x format. **NOTE**: When the available zone is insufficient, another availability zone may be deployed.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public InstanceState()
        {
        }
        public static new InstanceState Empty => new InstanceState();
    }
}
