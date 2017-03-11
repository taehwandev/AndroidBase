package tech.thdev.base.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import tech.thdev.base.adapter.model.BaseRecyclerModel
import tech.thdev.base.model.BaseItem
import java.util.*

/**
 * Created by Tae-hwan on 7/21/16.
 */
abstract class BaseRecyclerAdapter<ITEM : BaseItem>(val context: Context)
    : RecyclerView.Adapter<BaseRecyclerViewHolder<ITEM>>(), BaseRecyclerModel<ITEM> {

    private val itemList: MutableList<ITEM> = ArrayList()

    override fun onBindViewHolder(holder: BaseRecyclerViewHolder<ITEM>?, position: Int) {
        holder?.onViewHolder(getItem(position), position)
    }

    // ?.let { } - safe call == if (null != obj) { }
    override fun getItemViewType(position: Int): Int {
        getItem(position)?.let { return it.viewType } ?: return super.getItemViewType(position)
    }

    override fun addItem(item: ITEM) {
        itemList.add(item)
    }

    override fun addItem(position: Int, item: ITEM) {
        itemList.add(position, item)
    }

    override fun addItems(items: List<ITEM>) {
        itemList.addAll(items)
    }

    override fun clear() {
        itemList.clear()
    }

    override fun removeItem(item: ITEM) {
        itemList.remove(item)
    }

    override fun removeItem(position: Int) {
        itemList.removeAt(position)
    }

    // Position >= or Position < 0 is null return
    override fun getItem(position: Int) = itemList.getOrNull(position)

    override fun getCount() = itemCount

    override fun getItemCount() = itemList.size
}