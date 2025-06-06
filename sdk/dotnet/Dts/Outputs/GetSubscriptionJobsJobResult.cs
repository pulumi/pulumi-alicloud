// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Dts.Outputs
{

    [OutputType]
    public sealed class GetSubscriptionJobsJobResult
    {
        /// <summary>
        /// Subscription start time in Unix timestamp format.
        /// </summary>
        public readonly string Checkpoint;
        /// <summary>
        /// The creation time of subscription job instance.
        /// </summary>
        public readonly string CreateTime;
        /// <summary>
        /// Subscription object, in the format of JSON strings.
        /// </summary>
        public readonly string DbList;
        /// <summary>
        /// The ID of subscription job instance.
        /// </summary>
        public readonly string DtsInstanceId;
        /// <summary>
        /// The ID of subscription job instance.
        /// </summary>
        public readonly string DtsJobId;
        /// <summary>
        /// The name of subscription job instance.
        /// </summary>
        public readonly string DtsJobName;
        /// <summary>
        /// The Expiration Time. Formatting with yyyy-MM-ddTHH:mm:ssZ(UTC time).
        /// </summary>
        public readonly string ExpireTime;
        /// <summary>
        /// The ID of the Subscription Job.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The payment type of the resource. Valid values: `Subscription`, `PayAsYouGo`.
        /// </summary>
        public readonly string PaymentType;
        /// <summary>
        /// To subscribe to the name of the database.
        /// </summary>
        public readonly string SourceEndpointDatabaseName;
        /// <summary>
        /// The source database type value is MySQL or Oracle.
        /// </summary>
        public readonly string SourceEndpointEngineName;
        /// <summary>
        /// The ID of source instance. Only when the type of source database instance was RDS MySQL, PolarDB-X 1.0, PolarDB MySQL, this parameter can be available and must be set.
        /// </summary>
        public readonly string SourceEndpointInstanceId;
        /// <summary>
        /// The type of source instance. Valid values: `RDS`, `PolarDB`, `DRDS`, `LocalInstance`, `ECS`, `Express`, `CEN`, `dg`.
        /// </summary>
        public readonly string SourceEndpointInstanceType;
        /// <summary>
        /// The IP of source endpoint.
        /// </summary>
        public readonly string SourceEndpointIp;
        /// <summary>
        /// The SID of Oracle Database. When the source database is self-built Oracle and the Oracle database is a non-RAC instance, this parameter is available and must be passed in.
        /// </summary>
        public readonly string SourceEndpointOracleSid;
        /// <summary>
        /// The Alibaba Cloud account ID to which the source instance belongs. This parameter is only available when configuring data subscriptions across Alibaba Cloud accounts and must be passed in.
        /// </summary>
        public readonly string SourceEndpointOwnerId;
        /// <summary>
        /// The  port of source database.
        /// </summary>
        public readonly string SourceEndpointPort;
        /// <summary>
        /// The region of source database.
        /// </summary>
        public readonly string SourceEndpointRegion;
        /// <summary>
        /// Both the authorization roles. When the source instance and configure subscriptions task of the Alibaba Cloud account is not the same as the need to pass the parameter, to specify the source of the authorization roles, to allow configuration subscription task of the Alibaba Cloud account to access the source of the source instance information.
        /// </summary>
        public readonly string SourceEndpointRole;
        /// <summary>
        /// The username of source database instance account.
        /// </summary>
        public readonly string SourceEndpointUserName;
        /// <summary>
        /// The status of the task. Valid values: `NotStarted`, `Normal`, `Abnormal`. When a task created, it is in this state of `NotStarted`. You can specify this state of `Normal` to start the job, and specify this state of `Abnormal` to stop the job.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// Whether to subscribe the DDL type of data. Valid values: `true`, `false`.
        /// </summary>
        public readonly bool SubscriptionDataTypeDdl;
        /// <summary>
        /// Whether to subscribe the DML type of data. Valid values: `true`, `false`.
        /// </summary>
        public readonly bool SubscriptionDataTypeDml;
        /// <summary>
        /// Network information.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSubscriptionJobsJobSubscriptionHostResult> SubscriptionHosts;
        /// <summary>
        /// The type of subscription instance network. Valid value: `classic`, `vpc`.
        /// </summary>
        public readonly string SubscriptionInstanceNetworkType;
        /// <summary>
        /// The ID of subscription instance vpc.
        /// </summary>
        public readonly string SubscriptionInstanceVpcId;
        /// <summary>
        /// The ID of subscription instance vswitch.
        /// </summary>
        public readonly string SubscriptionInstanceVswitchId;
        /// <summary>
        /// The tag of the resource.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Tags;

        [OutputConstructor]
        private GetSubscriptionJobsJobResult(
            string checkpoint,

            string createTime,

            string dbList,

            string dtsInstanceId,

            string dtsJobId,

            string dtsJobName,

            string expireTime,

            string id,

            string paymentType,

            string sourceEndpointDatabaseName,

            string sourceEndpointEngineName,

            string sourceEndpointInstanceId,

            string sourceEndpointInstanceType,

            string sourceEndpointIp,

            string sourceEndpointOracleSid,

            string sourceEndpointOwnerId,

            string sourceEndpointPort,

            string sourceEndpointRegion,

            string sourceEndpointRole,

            string sourceEndpointUserName,

            string status,

            bool subscriptionDataTypeDdl,

            bool subscriptionDataTypeDml,

            ImmutableArray<Outputs.GetSubscriptionJobsJobSubscriptionHostResult> subscriptionHosts,

            string subscriptionInstanceNetworkType,

            string subscriptionInstanceVpcId,

            string subscriptionInstanceVswitchId,

            ImmutableDictionary<string, string> tags)
        {
            Checkpoint = checkpoint;
            CreateTime = createTime;
            DbList = dbList;
            DtsInstanceId = dtsInstanceId;
            DtsJobId = dtsJobId;
            DtsJobName = dtsJobName;
            ExpireTime = expireTime;
            Id = id;
            PaymentType = paymentType;
            SourceEndpointDatabaseName = sourceEndpointDatabaseName;
            SourceEndpointEngineName = sourceEndpointEngineName;
            SourceEndpointInstanceId = sourceEndpointInstanceId;
            SourceEndpointInstanceType = sourceEndpointInstanceType;
            SourceEndpointIp = sourceEndpointIp;
            SourceEndpointOracleSid = sourceEndpointOracleSid;
            SourceEndpointOwnerId = sourceEndpointOwnerId;
            SourceEndpointPort = sourceEndpointPort;
            SourceEndpointRegion = sourceEndpointRegion;
            SourceEndpointRole = sourceEndpointRole;
            SourceEndpointUserName = sourceEndpointUserName;
            Status = status;
            SubscriptionDataTypeDdl = subscriptionDataTypeDdl;
            SubscriptionDataTypeDml = subscriptionDataTypeDml;
            SubscriptionHosts = subscriptionHosts;
            SubscriptionInstanceNetworkType = subscriptionInstanceNetworkType;
            SubscriptionInstanceVpcId = subscriptionInstanceVpcId;
            SubscriptionInstanceVswitchId = subscriptionInstanceVswitchId;
            Tags = tags;
        }
    }
}
