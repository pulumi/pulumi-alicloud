// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ess
{
    public static class GetNotifications
    {
        /// <summary>
        /// This data source provides available notification resources. 
        /// 
        /// &gt; **NOTE:** Available in 1.72.0+
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var ds = AliCloud.Ess.GetNotifications.Invoke(new()
        ///     {
        ///         ScalingGroupId = "scaling_group_id",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstNotification"] = ds.Apply(getNotificationsResult =&gt; getNotificationsResult.Notifications[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetNotificationsResult> InvokeAsync(GetNotificationsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetNotificationsResult>("alicloud:ess/getNotifications:getNotifications", args ?? new GetNotificationsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides available notification resources. 
        /// 
        /// &gt; **NOTE:** Available in 1.72.0+
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var ds = AliCloud.Ess.GetNotifications.Invoke(new()
        ///     {
        ///         ScalingGroupId = "scaling_group_id",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstNotification"] = ds.Apply(getNotificationsResult =&gt; getNotificationsResult.Notifications[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetNotificationsResult> Invoke(GetNotificationsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetNotificationsResult>("alicloud:ess/getNotifications:getNotifications", args ?? new GetNotificationsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides available notification resources. 
        /// 
        /// &gt; **NOTE:** Available in 1.72.0+
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var ds = AliCloud.Ess.GetNotifications.Invoke(new()
        ///     {
        ///         ScalingGroupId = "scaling_group_id",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstNotification"] = ds.Apply(getNotificationsResult =&gt; getNotificationsResult.Notifications[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetNotificationsResult> Invoke(GetNotificationsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetNotificationsResult>("alicloud:ess/getNotifications:getNotifications", args ?? new GetNotificationsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetNotificationsArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of notification ids.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// Scaling group id the notifications belong to.
        /// </summary>
        [Input("scalingGroupId", required: true)]
        public string ScalingGroupId { get; set; } = null!;

        public GetNotificationsArgs()
        {
        }
        public static new GetNotificationsArgs Empty => new GetNotificationsArgs();
    }

    public sealed class GetNotificationsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of notification ids.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// Scaling group id the notifications belong to.
        /// </summary>
        [Input("scalingGroupId", required: true)]
        public Input<string> ScalingGroupId { get; set; } = null!;

        public GetNotificationsInvokeArgs()
        {
        }
        public static new GetNotificationsInvokeArgs Empty => new GetNotificationsInvokeArgs();
    }


    [OutputType]
    public sealed class GetNotificationsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of notification ids.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        /// <summary>
        /// A list of notifications. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetNotificationsNotificationResult> Notifications;
        public readonly string? OutputFile;
        /// <summary>
        /// ID of the scaling group.
        /// </summary>
        public readonly string ScalingGroupId;

        [OutputConstructor]
        private GetNotificationsResult(
            string id,

            ImmutableArray<string> ids,

            ImmutableArray<Outputs.GetNotificationsNotificationResult> notifications,

            string? outputFile,

            string scalingGroupId)
        {
            Id = id;
            Ids = ids;
            Notifications = notifications;
            OutputFile = outputFile;
            ScalingGroupId = scalingGroupId;
        }
    }
}
