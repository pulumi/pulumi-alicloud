// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ActionTrail.Outputs
{

    [OutputType]
    public sealed class GetTopicsTopicResult
    {
        /// <summary>
        /// whether the current topic is kafka compact topic or not.
        /// </summary>
        public readonly bool CompactTopic;
        /// <summary>
        /// Time of creation.
        /// </summary>
        public readonly string CreateTime;
        /// <summary>
        /// whether the current topic is kafka local topic or not.
        /// </summary>
        public readonly bool LocalTopic;
        /// <summary>
        /// Partition number of the topic.
        /// </summary>
        public readonly int PartitionNum;
        /// <summary>
        /// Remark of the topic.
        /// </summary>
        public readonly string Remark;
        /// <summary>
        /// The current status code of the topic. There are three values to describe the topic status: 0 stands for the topic is in service, 1 stands for freezing and 2 stands for pause. 
        /// </summary>
        public readonly int Status;
        /// <summary>
        /// The name of the topic.
        /// </summary>
        public readonly string Topic;

        [OutputConstructor]
        private GetTopicsTopicResult(
            bool compactTopic,

            string createTime,

            bool localTopic,

            int partitionNum,

            string remark,

            int status,

            string topic)
        {
            CompactTopic = compactTopic;
            CreateTime = createTime;
            LocalTopic = localTopic;
            PartitionNum = partitionNum;
            Remark = remark;
            Status = status;
            Topic = topic;
        }
    }
}