// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Sae.Inputs
{

    public sealed class ApplicationKafkaConfigsArgs : global::Pulumi.ResourceArgs
    {
        [Input("kafkaConfigs")]
        private InputList<Inputs.ApplicationKafkaConfigsKafkaConfigArgs>? _kafkaConfigs;

        /// <summary>
        /// One or more logging configurations of ApsaraMQ for Kafka. See `kafka_configs` below.
        /// </summary>
        public InputList<Inputs.ApplicationKafkaConfigsKafkaConfigArgs> KafkaConfigs
        {
            get => _kafkaConfigs ?? (_kafkaConfigs = new InputList<Inputs.ApplicationKafkaConfigsKafkaConfigArgs>());
            set => _kafkaConfigs = value;
        }

        /// <summary>
        /// The endpoint of the ApsaraMQ for Kafka API.
        /// </summary>
        [Input("kafkaEndpoint")]
        public Input<string>? KafkaEndpoint { get; set; }

        /// <summary>
        /// The  ID of the ApsaraMQ for Kafka instance.
        /// </summary>
        [Input("kafkaInstanceId")]
        public Input<string>? KafkaInstanceId { get; set; }

        public ApplicationKafkaConfigsArgs()
        {
        }
        public static new ApplicationKafkaConfigsArgs Empty => new ApplicationKafkaConfigsArgs();
    }
}