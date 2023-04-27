// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Chatbot.Outputs
{

    [OutputType]
    public sealed class GetAgentsAgentResult
    {
        /// <summary>
        /// The agent id.
        /// </summary>
        public readonly string AgentId;
        /// <summary>
        /// Service space signature, which is used when PAAS interface specifies the service space.
        /// </summary>
        public readonly string AgentKey;
        /// <summary>
        /// The name of the agent.
        /// </summary>
        public readonly string AgentName;
        /// <summary>
        /// ID of the agent.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetAgentsAgentResult(
            string agentId,

            string agentKey,

            string agentName,

            string id)
        {
            AgentId = agentId;
            AgentKey = agentKey;
            AgentName = agentName;
            Id = id;
        }
    }
}