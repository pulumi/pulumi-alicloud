// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Amqp
{
    /// <summary>
    /// ## Import
    /// 
    /// Amqp Instance can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:amqp/instance:Instance example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:amqp/instance:Instance")]
    public partial class Instance : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Renewal method. Automatic renewal: true; Manual renewal: false. When RenewalStatus has a value, the value of RenewalStatus shall prevail.
        /// </summary>
        [Output("autoRenew")]
        public Output<bool?> AutoRenew { get; private set; } = null!;

        /// <summary>
        /// OrderCreateTime.
        /// </summary>
        [Output("createTime")]
        public Output<int> CreateTime { get; private set; } = null!;

        /// <summary>
        /// The instance name.
        /// </summary>
        [Output("instanceName")]
        public Output<string> InstanceName { get; private set; } = null!;

        /// <summary>
        /// Instance type. Valid values: 
        /// - professional: professional Edition
        /// - enterprise: enterprise Edition
        /// - vip: Platinum Edition.
        /// - serverless: Serverless Edition.
        /// &gt; **NOTE:** There should not set the `instance_type` parameter when creating a serverless instance. Only need to set `payment_type = "PayAsYouGo"` and `serverless_charge_type = "onDemand"`.
        /// </summary>
        [Output("instanceType")]
        public Output<string> InstanceType { get; private set; } = null!;

        /// <summary>
        /// The maximum number of connections, according to the value given on the purchase page of the cloud message queue RabbitMQ version console.
        /// </summary>
        [Output("maxConnections")]
        public Output<int> MaxConnections { get; private set; } = null!;

        /// <summary>
        /// Peak TPS traffic of the public network, which must be a multiple of 128, unit: times per second.
        /// </summary>
        [Output("maxEipTps")]
        public Output<string> MaxEipTps { get; private set; } = null!;

        /// <summary>
        /// Configure the private network TPS traffic peak, please set the value according to the cloud message queue RabbitMQ version of the console purchase page given.
        /// </summary>
        [Output("maxTps")]
        public Output<string> MaxTps { get; private set; } = null!;

        /// <summary>
        /// This parameter must be provided while you change the instance specification. Type of instance lifting and lowering:
        /// - Upgrade: Upgrade
        /// - Downgrade: Downgrading.
        /// </summary>
        [Output("modifyType")]
        public Output<string?> ModifyType { get; private set; } = null!;

        /// <summary>
        /// The Payment type. Valid value: 
        /// - Subscription: Pre-paid.
        /// - PayAsYouGo: Post-paid, and for serverless Edition.
        /// </summary>
        [Output("paymentType")]
        public Output<string> PaymentType { get; private set; } = null!;

        /// <summary>
        /// Prepayment cycle, unit: periodCycle. This parameter is valid when PaymentType is set to Subscription.
        /// </summary>
        [Output("period")]
        public Output<int?> Period { get; private set; } = null!;

        /// <summary>
        /// Prepaid cycle units. Value: Month, Year.
        /// </summary>
        [Output("periodCycle")]
        public Output<string?> PeriodCycle { get; private set; } = null!;

        /// <summary>
        /// Configure the maximum number of queues. The value range is as follows:  Professional version:[50,1000], minimum modification step size is 5  Enterprise Edition:[200,6000], minimum modification step size is 100  Platinum version:[10000,80000], minimum modification step size is 100.
        /// </summary>
        [Output("queueCapacity")]
        public Output<string> QueueCapacity { get; private set; } = null!;

        /// <summary>
        /// The number of automatic renewal cycles.
        /// </summary>
        [Output("renewalDuration")]
        public Output<int> RenewalDuration { get; private set; } = null!;

        /// <summary>
        /// Auto-Renewal Cycle Unit Values Include: Month: Month. Year: Years.
        /// </summary>
        [Output("renewalDurationUnit")]
        public Output<string> RenewalDurationUnit { get; private set; } = null!;

        /// <summary>
        /// The renewal status. Value: AutoRenewal: automatic renewal. ManualRenewal: manual renewal. NotRenewal: no renewal.
        /// </summary>
        [Output("renewalStatus")]
        public Output<string> RenewalStatus { get; private set; } = null!;

        /// <summary>
        /// The billing type of the serverless instance. Value: onDemand.
        /// </summary>
        [Output("serverlessChargeType")]
        public Output<string?> ServerlessChargeType { get; private set; } = null!;

        /// <summary>
        /// The status of the resource.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// Configure the message storage space. Unit: GB. The value is as follows:  Professional Edition and Enterprise Edition: Fixed to 0. Description A value of 0 indicates that the Professional Edition and Enterprise Edition instances do not charge storage fees, but do not have storage space. Platinum version example: m × 100, where the value range of m is [7,28].
        /// </summary>
        [Output("storageSize")]
        public Output<string> StorageSize { get; private set; } = null!;

        /// <summary>
        /// Whether to support public network.
        /// </summary>
        [Output("supportEip")]
        public Output<bool?> SupportEip { get; private set; } = null!;

        /// <summary>
        /// Whether to activate the message trace function. The values are as follows:  true: Enable message trace function false: message trace function is not enabled Description The Platinum Edition instance provides the 15-day message trace function free of charge. The trace function can only be enabled and the trace storage duration can only be set to 15 days. For instances of other specifications, you can enable or disable the trace function.
        /// </summary>
        [Output("supportTracing")]
        public Output<bool> SupportTracing { get; private set; } = null!;

        /// <summary>
        /// Configure the storage duration of message traces. Unit: Days. The value is as follows:  3:3 days 7:7 days 15:15 days This parameter is valid when SupportTracing is true.
        /// </summary>
        [Output("tracingStorageTime")]
        public Output<int> TracingStorageTime { get; private set; } = null!;


        /// <summary>
        /// Create a Instance resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Instance(string name, InstanceArgs args, CustomResourceOptions? options = null)
            : base("alicloud:amqp/instance:Instance", name, args ?? new InstanceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Instance(string name, Input<string> id, InstanceState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:amqp/instance:Instance", name, state, MakeResourceOptions(options, id))
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
        /// Renewal method. Automatic renewal: true; Manual renewal: false. When RenewalStatus has a value, the value of RenewalStatus shall prevail.
        /// </summary>
        [Input("autoRenew")]
        public Input<bool>? AutoRenew { get; set; }

        /// <summary>
        /// The instance name.
        /// </summary>
        [Input("instanceName")]
        public Input<string>? InstanceName { get; set; }

        /// <summary>
        /// Instance type. Valid values: 
        /// - professional: professional Edition
        /// - enterprise: enterprise Edition
        /// - vip: Platinum Edition.
        /// - serverless: Serverless Edition.
        /// &gt; **NOTE:** There should not set the `instance_type` parameter when creating a serverless instance. Only need to set `payment_type = "PayAsYouGo"` and `serverless_charge_type = "onDemand"`.
        /// </summary>
        [Input("instanceType")]
        public Input<string>? InstanceType { get; set; }

        /// <summary>
        /// The maximum number of connections, according to the value given on the purchase page of the cloud message queue RabbitMQ version console.
        /// </summary>
        [Input("maxConnections")]
        public Input<int>? MaxConnections { get; set; }

        /// <summary>
        /// Peak TPS traffic of the public network, which must be a multiple of 128, unit: times per second.
        /// </summary>
        [Input("maxEipTps")]
        public Input<string>? MaxEipTps { get; set; }

        /// <summary>
        /// Configure the private network TPS traffic peak, please set the value according to the cloud message queue RabbitMQ version of the console purchase page given.
        /// </summary>
        [Input("maxTps")]
        public Input<string>? MaxTps { get; set; }

        /// <summary>
        /// This parameter must be provided while you change the instance specification. Type of instance lifting and lowering:
        /// - Upgrade: Upgrade
        /// - Downgrade: Downgrading.
        /// </summary>
        [Input("modifyType")]
        public Input<string>? ModifyType { get; set; }

        /// <summary>
        /// The Payment type. Valid value: 
        /// - Subscription: Pre-paid.
        /// - PayAsYouGo: Post-paid, and for serverless Edition.
        /// </summary>
        [Input("paymentType", required: true)]
        public Input<string> PaymentType { get; set; } = null!;

        /// <summary>
        /// Prepayment cycle, unit: periodCycle. This parameter is valid when PaymentType is set to Subscription.
        /// </summary>
        [Input("period")]
        public Input<int>? Period { get; set; }

        /// <summary>
        /// Prepaid cycle units. Value: Month, Year.
        /// </summary>
        [Input("periodCycle")]
        public Input<string>? PeriodCycle { get; set; }

        /// <summary>
        /// Configure the maximum number of queues. The value range is as follows:  Professional version:[50,1000], minimum modification step size is 5  Enterprise Edition:[200,6000], minimum modification step size is 100  Platinum version:[10000,80000], minimum modification step size is 100.
        /// </summary>
        [Input("queueCapacity")]
        public Input<string>? QueueCapacity { get; set; }

        /// <summary>
        /// The number of automatic renewal cycles.
        /// </summary>
        [Input("renewalDuration")]
        public Input<int>? RenewalDuration { get; set; }

        /// <summary>
        /// Auto-Renewal Cycle Unit Values Include: Month: Month. Year: Years.
        /// </summary>
        [Input("renewalDurationUnit")]
        public Input<string>? RenewalDurationUnit { get; set; }

        /// <summary>
        /// The renewal status. Value: AutoRenewal: automatic renewal. ManualRenewal: manual renewal. NotRenewal: no renewal.
        /// </summary>
        [Input("renewalStatus")]
        public Input<string>? RenewalStatus { get; set; }

        /// <summary>
        /// The billing type of the serverless instance. Value: onDemand.
        /// </summary>
        [Input("serverlessChargeType")]
        public Input<string>? ServerlessChargeType { get; set; }

        /// <summary>
        /// Configure the message storage space. Unit: GB. The value is as follows:  Professional Edition and Enterprise Edition: Fixed to 0. Description A value of 0 indicates that the Professional Edition and Enterprise Edition instances do not charge storage fees, but do not have storage space. Platinum version example: m × 100, where the value range of m is [7,28].
        /// </summary>
        [Input("storageSize")]
        public Input<string>? StorageSize { get; set; }

        /// <summary>
        /// Whether to support public network.
        /// </summary>
        [Input("supportEip")]
        public Input<bool>? SupportEip { get; set; }

        /// <summary>
        /// Whether to activate the message trace function. The values are as follows:  true: Enable message trace function false: message trace function is not enabled Description The Platinum Edition instance provides the 15-day message trace function free of charge. The trace function can only be enabled and the trace storage duration can only be set to 15 days. For instances of other specifications, you can enable or disable the trace function.
        /// </summary>
        [Input("supportTracing")]
        public Input<bool>? SupportTracing { get; set; }

        /// <summary>
        /// Configure the storage duration of message traces. Unit: Days. The value is as follows:  3:3 days 7:7 days 15:15 days This parameter is valid when SupportTracing is true.
        /// </summary>
        [Input("tracingStorageTime")]
        public Input<int>? TracingStorageTime { get; set; }

        public InstanceArgs()
        {
        }
        public static new InstanceArgs Empty => new InstanceArgs();
    }

    public sealed class InstanceState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Renewal method. Automatic renewal: true; Manual renewal: false. When RenewalStatus has a value, the value of RenewalStatus shall prevail.
        /// </summary>
        [Input("autoRenew")]
        public Input<bool>? AutoRenew { get; set; }

        /// <summary>
        /// OrderCreateTime.
        /// </summary>
        [Input("createTime")]
        public Input<int>? CreateTime { get; set; }

        /// <summary>
        /// The instance name.
        /// </summary>
        [Input("instanceName")]
        public Input<string>? InstanceName { get; set; }

        /// <summary>
        /// Instance type. Valid values: 
        /// - professional: professional Edition
        /// - enterprise: enterprise Edition
        /// - vip: Platinum Edition.
        /// - serverless: Serverless Edition.
        /// &gt; **NOTE:** There should not set the `instance_type` parameter when creating a serverless instance. Only need to set `payment_type = "PayAsYouGo"` and `serverless_charge_type = "onDemand"`.
        /// </summary>
        [Input("instanceType")]
        public Input<string>? InstanceType { get; set; }

        /// <summary>
        /// The maximum number of connections, according to the value given on the purchase page of the cloud message queue RabbitMQ version console.
        /// </summary>
        [Input("maxConnections")]
        public Input<int>? MaxConnections { get; set; }

        /// <summary>
        /// Peak TPS traffic of the public network, which must be a multiple of 128, unit: times per second.
        /// </summary>
        [Input("maxEipTps")]
        public Input<string>? MaxEipTps { get; set; }

        /// <summary>
        /// Configure the private network TPS traffic peak, please set the value according to the cloud message queue RabbitMQ version of the console purchase page given.
        /// </summary>
        [Input("maxTps")]
        public Input<string>? MaxTps { get; set; }

        /// <summary>
        /// This parameter must be provided while you change the instance specification. Type of instance lifting and lowering:
        /// - Upgrade: Upgrade
        /// - Downgrade: Downgrading.
        /// </summary>
        [Input("modifyType")]
        public Input<string>? ModifyType { get; set; }

        /// <summary>
        /// The Payment type. Valid value: 
        /// - Subscription: Pre-paid.
        /// - PayAsYouGo: Post-paid, and for serverless Edition.
        /// </summary>
        [Input("paymentType")]
        public Input<string>? PaymentType { get; set; }

        /// <summary>
        /// Prepayment cycle, unit: periodCycle. This parameter is valid when PaymentType is set to Subscription.
        /// </summary>
        [Input("period")]
        public Input<int>? Period { get; set; }

        /// <summary>
        /// Prepaid cycle units. Value: Month, Year.
        /// </summary>
        [Input("periodCycle")]
        public Input<string>? PeriodCycle { get; set; }

        /// <summary>
        /// Configure the maximum number of queues. The value range is as follows:  Professional version:[50,1000], minimum modification step size is 5  Enterprise Edition:[200,6000], minimum modification step size is 100  Platinum version:[10000,80000], minimum modification step size is 100.
        /// </summary>
        [Input("queueCapacity")]
        public Input<string>? QueueCapacity { get; set; }

        /// <summary>
        /// The number of automatic renewal cycles.
        /// </summary>
        [Input("renewalDuration")]
        public Input<int>? RenewalDuration { get; set; }

        /// <summary>
        /// Auto-Renewal Cycle Unit Values Include: Month: Month. Year: Years.
        /// </summary>
        [Input("renewalDurationUnit")]
        public Input<string>? RenewalDurationUnit { get; set; }

        /// <summary>
        /// The renewal status. Value: AutoRenewal: automatic renewal. ManualRenewal: manual renewal. NotRenewal: no renewal.
        /// </summary>
        [Input("renewalStatus")]
        public Input<string>? RenewalStatus { get; set; }

        /// <summary>
        /// The billing type of the serverless instance. Value: onDemand.
        /// </summary>
        [Input("serverlessChargeType")]
        public Input<string>? ServerlessChargeType { get; set; }

        /// <summary>
        /// The status of the resource.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// Configure the message storage space. Unit: GB. The value is as follows:  Professional Edition and Enterprise Edition: Fixed to 0. Description A value of 0 indicates that the Professional Edition and Enterprise Edition instances do not charge storage fees, but do not have storage space. Platinum version example: m × 100, where the value range of m is [7,28].
        /// </summary>
        [Input("storageSize")]
        public Input<string>? StorageSize { get; set; }

        /// <summary>
        /// Whether to support public network.
        /// </summary>
        [Input("supportEip")]
        public Input<bool>? SupportEip { get; set; }

        /// <summary>
        /// Whether to activate the message trace function. The values are as follows:  true: Enable message trace function false: message trace function is not enabled Description The Platinum Edition instance provides the 15-day message trace function free of charge. The trace function can only be enabled and the trace storage duration can only be set to 15 days. For instances of other specifications, you can enable or disable the trace function.
        /// </summary>
        [Input("supportTracing")]
        public Input<bool>? SupportTracing { get; set; }

        /// <summary>
        /// Configure the storage duration of message traces. Unit: Days. The value is as follows:  3:3 days 7:7 days 15:15 days This parameter is valid when SupportTracing is true.
        /// </summary>
        [Input("tracingStorageTime")]
        public Input<int>? TracingStorageTime { get; set; }

        public InstanceState()
        {
        }
        public static new InstanceState Empty => new InstanceState();
    }
}
