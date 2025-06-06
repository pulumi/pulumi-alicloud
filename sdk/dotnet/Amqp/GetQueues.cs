// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Amqp
{
    public static class GetQueues
    {
        /// <summary>
        /// This data source provides the Amqp Queues of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.127.0+.
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
        ///     var ids = AliCloud.Amqp.GetQueues.Invoke(new()
        ///     {
        ///         InstanceId = "amqp-abc12345",
        ///         VirtualHostName = "my-VirtualHost",
        ///         Ids = new[]
        ///         {
        ///             "my-Queue-1",
        ///             "my-Queue-2",
        ///         },
        ///     });
        /// 
        ///     var nameRegex = AliCloud.Amqp.GetQueues.Invoke(new()
        ///     {
        ///         InstanceId = "amqp-abc12345",
        ///         VirtualHostName = "my-VirtualHost",
        ///         NameRegex = "^my-Queue",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["amqpQueueId1"] = ids.Apply(getQueuesResult =&gt; getQueuesResult.Queues[0]?.Id),
        ///         ["amqpQueueId2"] = nameRegex.Apply(getQueuesResult =&gt; getQueuesResult.Queues[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetQueuesResult> InvokeAsync(GetQueuesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetQueuesResult>("alicloud:amqp/getQueues:getQueues", args ?? new GetQueuesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Amqp Queues of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.127.0+.
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
        ///     var ids = AliCloud.Amqp.GetQueues.Invoke(new()
        ///     {
        ///         InstanceId = "amqp-abc12345",
        ///         VirtualHostName = "my-VirtualHost",
        ///         Ids = new[]
        ///         {
        ///             "my-Queue-1",
        ///             "my-Queue-2",
        ///         },
        ///     });
        /// 
        ///     var nameRegex = AliCloud.Amqp.GetQueues.Invoke(new()
        ///     {
        ///         InstanceId = "amqp-abc12345",
        ///         VirtualHostName = "my-VirtualHost",
        ///         NameRegex = "^my-Queue",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["amqpQueueId1"] = ids.Apply(getQueuesResult =&gt; getQueuesResult.Queues[0]?.Id),
        ///         ["amqpQueueId2"] = nameRegex.Apply(getQueuesResult =&gt; getQueuesResult.Queues[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetQueuesResult> Invoke(GetQueuesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetQueuesResult>("alicloud:amqp/getQueues:getQueues", args ?? new GetQueuesInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Amqp Queues of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.127.0+.
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
        ///     var ids = AliCloud.Amqp.GetQueues.Invoke(new()
        ///     {
        ///         InstanceId = "amqp-abc12345",
        ///         VirtualHostName = "my-VirtualHost",
        ///         Ids = new[]
        ///         {
        ///             "my-Queue-1",
        ///             "my-Queue-2",
        ///         },
        ///     });
        /// 
        ///     var nameRegex = AliCloud.Amqp.GetQueues.Invoke(new()
        ///     {
        ///         InstanceId = "amqp-abc12345",
        ///         VirtualHostName = "my-VirtualHost",
        ///         NameRegex = "^my-Queue",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["amqpQueueId1"] = ids.Apply(getQueuesResult =&gt; getQueuesResult.Queues[0]?.Id),
        ///         ["amqpQueueId2"] = nameRegex.Apply(getQueuesResult =&gt; getQueuesResult.Queues[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetQueuesResult> Invoke(GetQueuesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetQueuesResult>("alicloud:amqp/getQueues:getQueues", args ?? new GetQueuesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetQueuesArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Queue IDs. Its element value is same as Queue Name.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The ID of the instance.
        /// </summary>
        [Input("instanceId", required: true)]
        public string InstanceId { get; set; } = null!;

        /// <summary>
        /// A regex string to filter results by Queue name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The name of the virtual host.
        /// </summary>
        [Input("virtualHostName", required: true)]
        public string VirtualHostName { get; set; } = null!;

        public GetQueuesArgs()
        {
        }
        public static new GetQueuesArgs Empty => new GetQueuesArgs();
    }

    public sealed class GetQueuesInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Queue IDs. Its element value is same as Queue Name.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The ID of the instance.
        /// </summary>
        [Input("instanceId", required: true)]
        public Input<string> InstanceId { get; set; } = null!;

        /// <summary>
        /// A regex string to filter results by Queue name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The name of the virtual host.
        /// </summary>
        [Input("virtualHostName", required: true)]
        public Input<string> VirtualHostName { get; set; } = null!;

        public GetQueuesInvokeArgs()
        {
        }
        public static new GetQueuesInvokeArgs Empty => new GetQueuesInvokeArgs();
    }


    [OutputType]
    public sealed class GetQueuesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string InstanceId;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly ImmutableArray<Outputs.GetQueuesQueueResult> Queues;
        public readonly string VirtualHostName;

        [OutputConstructor]
        private GetQueuesResult(
            string id,

            ImmutableArray<string> ids,

            string instanceId,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            ImmutableArray<Outputs.GetQueuesQueueResult> queues,

            string virtualHostName)
        {
            Id = id;
            Ids = ids;
            InstanceId = instanceId;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            Queues = queues;
            VirtualHostName = virtualHostName;
        }
    }
}
