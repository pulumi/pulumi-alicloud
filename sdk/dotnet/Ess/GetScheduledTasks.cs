// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ess
{
    public static class GetScheduledTasks
    {
        /// <summary>
        /// This data source provides available scheduled task resources. 
        /// 
        /// &gt; **NOTE:** Available in 1.72.0+
        /// 
        /// {{% examples %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetScheduledTasksResult> InvokeAsync(GetScheduledTasksArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetScheduledTasksResult>("alicloud:ess/getScheduledTasks:getScheduledTasks", args ?? new GetScheduledTasksArgs(), options.WithVersion());
    }


    public sealed class GetScheduledTasksArgs : Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of scheduled task IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter resulting scheduled tasks by name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The operation to be performed when a scheduled task is triggered.
        /// </summary>
        [Input("scheduledAction")]
        public string? ScheduledAction { get; set; }

        /// <summary>
        /// The id of the scheduled task.
        /// </summary>
        [Input("scheduledTaskId")]
        public string? ScheduledTaskId { get; set; }

        public GetScheduledTasksArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetScheduledTasksResult
    {
        /// <summary>
        /// id is the provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of scheduled task ids.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        public readonly string? NameRegex;
        /// <summary>
        /// A list of scheduled task names.
        /// </summary>
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        /// <summary>
        /// The operation to be performed when a scheduled task is triggered.
        /// </summary>
        public readonly string? ScheduledAction;
        public readonly string? ScheduledTaskId;
        /// <summary>
        /// A list of scheduled tasks. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetScheduledTasksTaskResult> Tasks;

        [OutputConstructor]
        private GetScheduledTasksResult(
            string id,

            ImmutableArray<string> ids,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            string? scheduledAction,

            string? scheduledTaskId,

            ImmutableArray<Outputs.GetScheduledTasksTaskResult> tasks)
        {
            Id = id;
            Ids = ids;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            ScheduledAction = scheduledAction;
            ScheduledTaskId = scheduledTaskId;
            Tasks = tasks;
        }
    }
}